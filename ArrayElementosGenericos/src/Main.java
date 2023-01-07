
public class Main {
	    public static void main(String[]args){
	        
	        Integer[]a={20,25,31};
	        Double[]b={3.1415,2.7182,1.618};
	        Boolean[]c={true,false};
	        Character[]d={'I','n','f','o','r','m','á','t','i','c','a'};    
	        String[]e={"Administración " + "Sistemas " + "Informáticos"};
	                
	                
	                
	        imprimirArray(a);
	        imprimirArray(b);
	        imprimirArray(c);
	        imprimirArray(d);
	        imprimirArray(e);
	    }
	    public static <Generico> void imprimirArray(Generico[]a){
	    	for(int i=0;i<a.length;i++){
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	    }
}
