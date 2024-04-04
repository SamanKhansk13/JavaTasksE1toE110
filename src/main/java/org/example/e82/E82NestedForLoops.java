package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
String [][] name={
        {"syntax","syntax","syntax"},
        {"syntax","syntax","syntax"}
};
        for (int i=0; i< name.length;i++){
            for (int j=0; j<name[i].length;j++){
                System.out.println(name[i][j]);
            }
        }



    }
}
