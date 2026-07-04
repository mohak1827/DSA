class Solution {
    public String validIPAddress(String queryIP) {

        String[] arr = queryIP.split("[\\.,:]");

        int dot = 0;
        int c = 0;

        for(int i = 0; i < queryIP.length(); i++){
            char ch = queryIP.charAt(i);
            if(ch == '.'){
                dot++;
            }else if(ch == ':'){
                c++;
            }
        }
        // System.out.println(arr.length);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        if(arr.length != 4 && arr.length != 8){
            return "Neither";
        }
        
        if(arr.length == 4){
            for(int i = 0; i < 4; i++){
                
                String temp = arr[i];

                if(temp.length() == 0){
                    return "Neither";
                }
                String str = "";
                if((temp.charAt(0) == '0' && temp.length() != 1) || dot != 3){
                    return "Neither";
                }

                int idx = 0;

                while(idx < temp.length()){
                    char ch = temp.charAt(idx);
                    if(!Character.isDigit(ch)){
                        return "Neither";
                    }else{
                        str += ch;
                    }
                    idx++;
                }
                if(str.length() > 3){
                    return "Neither";
                }
                int val = Integer.valueOf(str);
                System.out.println(val);

                if(val <= 255 && val >= 0){
                    continue;
                }else{
                    return "Neither";
                }
            }
            return "IPv4";
        }
        else{
            if(c != 7){
                return "Neither";
            }
            for(int i = 0; i < 8; i++){

                String temp = arr[i];
                if(temp.length() >= 1 && temp.length() <= 4){

                }else{
                    return "Neither";
                }

                System.out.println(temp);

                int idx = 0;

                while(idx < temp.length()){

                    char val = temp.charAt(idx);
                    
                    if(!Character.isDigit(val)){
                        if(Character.isLetter(val)){
                            val = Character.toLowerCase(val);
                            if(val != 'a' && val != 'b' && val != 'c' && val != 'd' && val != 'e' && val != 'f'){
                                return "Neither";
                            }
                        }else{
                            return "Neither";
                        }
                    }
                    idx++;
                }
            }
            return "IPv6";
        }
        // return "";
    }
}