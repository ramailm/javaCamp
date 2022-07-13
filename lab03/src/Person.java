public class Person {

    String id,gender;
    double tChol,hdl;

    public Person(String id, String gender, double tChol, double hdl){
        this.id = id;
        this.gender = gender;
        this.tChol = tChol;
        this.hdl = hdl;
    }

    public double getCholesterolRatio(){
        return tChol/hdl;
    }

    public boolean hasGoodTotalCholesterol(){
        return tChol < 200;
    }

    public boolean hasGoodHDL(){
        if(gender.equalsIgnoreCase("male"))
            return hdl >= 40;
        else
            return hdl >= 45;
    }

    public boolean hasGoodCholesterolRatio(){
        return getCholesterolRatio() <= 4.5;
    }

    public void printReport(){
        String goodTchol = hasGoodTotalCholesterol() ? " (good)":" (bad)";
        String goodHdl = hasGoodHDL() ? " (good)":" (bad)";
        String goodRatio = hasGoodCholesterolRatio() ? " (good)":" (bad)";
        System.out.println("---------------------");
        System.out.println(id + "'s Report:\n"
                           + "Total Cholestrol: " + tChol + goodTchol
                           + "\nHDL: " + hdl + goodHdl
                           + "\nTC/HDL Ratio: " + getCholesterolRatio() + goodRatio);
    }


}
