public class Main {

    public static void main(String[] args) {
        ICustomerdal iCustomerdal=new OracleDatabaseDal();
        OracleDatabaseDal oracleDatabaseDal=new OracleDatabaseDal();
        oracleDatabaseDal.add();
        CustomerManager customerManager=new CustomerManager();
        customerManager.customerdal =new OracleDatabaseDal();
        customerManager.add();
    }
}
