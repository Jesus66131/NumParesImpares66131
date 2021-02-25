package numparesimpares66131;

public class NumParesImpares66131 {

    public static void main(String[] args) {
        
        int i = 1, par = 0, impar = 0;
        while(i<=100){
            if(i%2==0){
                par+=i;
            }
            else{
                impar+=i;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("La suma de los pares es: " + par);
        System.out.println("La suma de los impares es: " + impar);
        
    }
}
