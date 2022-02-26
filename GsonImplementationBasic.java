public class GsonImplementationBasic {
        public static void main(String[] args) {
            System.out.println("Serialization");
            String json = serializeUserSimple();
            System.out.println(json);
            System.out.println("Deserialization");
            UserSimple userSimple = deserializeUserSimple(json);
            System.out.println(userSimple.name);
        }
        
        // function to convert java object to json format stored as String
        private static String serializeUserSimple(){
            UserSimple user = new UserSimple(
                    "Drishti",
                    "drishti@gmail.com",
                    23,
                    true
            );
            Gson gson = new Gson();
            String json = gson.toJson(user);
            return json;
        }

        // function to convert json object stored as String to java object
        private static UserSimple deserializeUserSimple(String json){
            Gson gson = new Gson();
            UserSimple userSimple = gson.fromJson(json,UserSimple.class);
            return userSimple;
        }

}
