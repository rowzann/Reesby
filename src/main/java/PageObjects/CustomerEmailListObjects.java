package main.java.PageObjects;

public interface CustomerEmailListObjects {
    //String EmailTitle="//*[@id=\"root\"]/div[2]/div/div/div/div[1]/div/div[1]/h10";
    String tableDataRow="//*[@id=\"root\"]/div/div/div/div/div[3]/div[1]/div[2]/div/div[1]/table/tbody/tr";
    String rowsPerPagebutton="//*[@id=\"root\"]/div/div/div/div/div[3]/div[1]/div[3]/div/div/div[2]";
    String rowsPerPagebutton5="//*[@id=\"menu-\"]/div[3]/ul/li[1]";

    String Searchbox="//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div/div/div/input";

    String tableColumn="//*[@id=\"root\"]/div[2]/div/div/div/div[3]/div[1]/div[2]/div/div[1]/table/tbody/tr/td";
    String addButton="//*[@id=\"root\"]/div[2]/div/div/div/div[4]/div[2]/button";
    String fullname="/html/body/div[2]/div[3]/div/form/div[1]/div/div/div[1]/div/div/input";
    String email="/html/body/div[2]/div[3]/div/form/div[1]/div/div/div[2]/div/div/input";
    String homeAddress="/html/body/div[2]/div[3]/div/form/div[1]/div/div/div[3]/div/div/input";
    String phone_number="/html/body/div[2]/div[3]/div/form/div[1]/div/div/div[4]/div/div/input";
    String job_title="/html/body/div[2]/div[3]/div/form/div[1]/div/div/div[5]/div/div/input";
    String createButton="/html/body/div[2]/div[3]/div/form/div[2]/button[2]";
    String ListNameTitle="//span[@class='MuiTypography-root MuiCardHeader-title MuiTypography-h5 MuiTypography-displayBlock']";

}
