package Extensao;


public class mat {
    



    public int Calcletras(String totalletras){
        return totalletras.length();
    }
    public int Calcletras(String totalString, int letras){
        char temp;
        int totaldevogais=0;
        for (int x=0; x<letras; x++){
            temp = totalString.charAt(x);
            if (temp == 'a'){
                totaldevogais++;
            }
            
            if (temp == 'e'){
                totaldevogais++;
            }
            
            if (temp == 'i'){
                totaldevogais++;
            }
            
            if (temp == 'o'){
                totaldevogais++;
            }

            if (temp == 'u'){
                totaldevogais++;
            }

        }
        return totaldevogais;
    }




}
