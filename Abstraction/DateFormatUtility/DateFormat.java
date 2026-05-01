package DateFormatUtility;

public interface DateFormat {
    public static void format(int d,int m,int y,int choice){
        if(choice==1){
            System.out.println(d+"-"+m+"-"+y);
        }
        else if(choice==2){
            System.out.println(m+"-"+d+"-"+y);
        }
        else if(choice==3){
            System.out.println(y+"-"+m+"-"+d);
        }
        else{
            System.out.println("There is no such format");
        }
    }
}
