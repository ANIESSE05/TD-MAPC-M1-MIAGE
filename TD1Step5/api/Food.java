package TD1Step5.api;

public  interface Food {
    double weight();
    
    default double colorie(){
        return  0;
    }
    
}
