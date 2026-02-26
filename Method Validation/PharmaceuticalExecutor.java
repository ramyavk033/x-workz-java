public class PharmaceuticalExecutor {

    public static void main(String[] args) {

        PharmaceuticalCompany.createMedicine("HealthPlus","Paracetamol","Tablet",50,500,2026,true,1000,"HealthPlus Labs");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("Medicare","Cough Syrup","Syrup",120,100,2025,false,500,"Medicare Pharma");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("PharmaCare","Ibuprofen","Tablet",80,400,2027,true,800,"PharmaCare Ltd");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("WellnessCo","Amoxicillin","Capsule",150,250,2026,true,600,"WellnessCo Labs");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("HealFast","Vitamin C","Tablet",60,500,2025,false,1200,"HealFast Pharma");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("CureAll","Antacid","Tablet",40,250,2024,false,900,"CureAll Labs");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("LifeCare","Aspirin","Tablet",70,325,2026,true,1100,"LifeCare Pharma");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("GoodHealth","SyrupX","Syrup",130,150,2025,false,400,"GoodHealth Labs");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("BioMed","Insulin","Injection",500,40,2026,true,200,"BioMed Pharma");
        PharmaceuticalCompany.getMedicine();

        PharmaceuticalCompany.createMedicine("SafeMeds","Antihistamine","Tablet",90,100,2027,false,750,"SafeMeds Ltd");
        PharmaceuticalCompany.getMedicine();
    }
}