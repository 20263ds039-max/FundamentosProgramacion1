public class U2_ejercicio5 {
    public static void main(String[] args) {
        System.out.println("HELLO");

        int a,b,c;
        a=5;
        b=10;
        c=1;

        if (a<=0 || b<=0 || c<=0) {
            System.out.println("no se admiten los ceros");
        }else{
            if(a>b && a>c){
            System.out.println("el mayor es: "+a);
        }else if (b>a && b>c) {
            System.out.println("el mayor es: "+b);
        }else {
            System.out.println("el mayor es: "+c);
        }
        }

    int num=1;
    while(num<=5) {
        System.out.println(num);
        num++;
        
    }    
    System.out.println(num);

    while(num>=0){
        System.out.println(num);
        num--;
    }
        
    }    
}
