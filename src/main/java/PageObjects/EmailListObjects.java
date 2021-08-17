package main.java.PageObjects;

public interface EmailListObjects {
    String newEmailListButton="//span[@class='MuiButton-startIcon MuiButton-iconSizeMedium']//*[local-name()='svg']";
    String emailListName="//input[@placeholder='Email List Name']";
    String FileUploader="//a[normalize-space()='browse']";
    String cancelButtom="//span[normalize-space()='Cancel Creation']";
    String craeteButton="//*[@id=\"root\"]/div[2]/div/div/div/form/div[3]/button[2]";
    String searchField="//*[@id=\"root\"]/div[2]/div/div/div/div[2]/div[1]/div/div/div/input";
    String rowDicTable="/html/body/div/div[2]/div/div/div/div[3]/div[1]";
    String firstRow="//*[@id=\"root\"]/div[2]/div/div/div/div[3]/div[1]/div/div[1]/div/a";
    String results="//*[@id=\"root\"]/div[2]/div/div/div/div[3]/p";
    String nextbutton="//a[normalize-space()='next']";
    String prebutton="//a[normalize-space()='previous']";

}
