import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashDataBase {
    String[] solution(String[][] queries) {
        // three types of commands - set, get, delete
        //one string element per query row
        String[] queryStrings = new String[queries.length];
        //make hashmap database
        HashMap<String, HashMap<String,String>> data = new HashMap<String, HashMap<String,String>>();
        //query each row and check first string input
        for(int i = 0; i< queries.length; i++){
            // decide approach based on first column of row
            if(queries[i][0].equals("SET")){
                //if hashmap doesn't contain key'
                if(!data.containsKey(queries[i][1])){
                    //make new hashmap value and add the info from 2/3 index
                    HashMap<String, String> hs = new HashMap<String,String>();
                    hs.put(queries[i][2],queries[i][3]);
                    //set the key value entry for database
                    data.put(queries[i][1],hs);
                    //set empty string for query if it is set
                    queryStrings[i] = "";
                }else{
                    data.get(queries[i][1]).put(queries[i][2], queries[i][3]);
                    queryStrings[i] = "";
                }
            }else if(queries[i][0].equals("GET")){
                //return value of query of hashmap from
                //check if it holds main key
                if(data.containsKey(queries[i][1])){
                    //check for value hashmap if it contains key
                    if(data.get(queries[i][1]).containsKey(queries[i][2])){
                        queryStrings[i] = data.get(queries[i][1]).get(queries[i][2]);
                    }else{
                        queryStrings[i] = "";
                    }

                }else{
                    queryStrings[i] = "";
                }
                //set query for delete
            }else if(queries[i][0].equals("DELETE")){
                //store true if it contains key, false if it does't
                //check if it holds main key
                if(data.containsKey(queries[i][1])){
                    //check for value hashmap if it contains key
                    if(data.get(queries[i][1]).containsKey(queries[i][2])){
                        queryStrings[i] = "true";
                        data.get(queries[i][1]).remove(queries[i][2]);

                    }else{
                        queryStrings[i] = "false";
                    }

                }else{
                    queryStrings[i] = "false";
                }//scan method
            }else if(queries[i][0].equals("SCAN")){
                //store true if it contains key
                if(!data.containsKey(queries[i][1])){
                    queryStrings[i] = "";
                }else{
                    //if it contains key
                    List<String> listS = new ArrayList<>();
                    for(String s: data.get(queries[i][1]).keySet()){
                        //iterate through each value in the hashmap of value
                        //add value and join by comma space
                        if(queries[i][2].equals("")){
                            //concat key with value
                            String ss =  s+"("+data.get(queries[i][1]).get(s)+")";
                            listS.add(ss);
                        }else{
                            //check if prefix matches
                            if(s.charAt(0) == queries[i][2].charAt(0)){
                                String ss =  s+"("+data.get(queries[i][1]).get(s)+")";
                                listS.add(ss);
                            }
                        }

                    }
                    //add to querystring value
                    queryStrings[i] = String.join(", ", listS);
                }

            }
        }


        return queryStrings;




    }


}
