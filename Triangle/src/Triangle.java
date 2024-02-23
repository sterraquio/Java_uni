public class Triangle {
    //Atributes
    int base;
    int height;



    //methods
    
    public static int calculateArea(int b, int h){

        int area = (b*h);
       
        return area;
    } 

    public static int calculatePerimeter(int b, int h){

        int c = (b+h);
        int perimeter = (c/2);

        return perimeter;
    } 
}
