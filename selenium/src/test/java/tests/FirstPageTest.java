package tests;

import org.testng.annotations.Test;

public class FirstPageTest extends BaseTest{

    @Test
    public void createNewPaste(){
        mainPageSecond.openPage();
        mainPageSecond.writeTextInToNewPasteField("Hello from WebDriver");
        mainPageSecond.selectPasteExpiration();
        mainPageSecond.writeTextInToPasteNameField("helloweb");
        mainPageSecond.pressCreateNewPasteButton();
    }
}