package tests;

import org.testng.annotations.Test;

public class SecondPageTests extends BaseTest{

    @Test
    public void checkPageTitleAndPasteNameMath(){
        String textForPasteField = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String textForPasteName = "how to gain dominance among developers";
        mainPageSecond.openPage();
        mainPageSecond.writeTextInToNewPasteField(textForPasteField);
        mainPageSecond.selectSyntaxHighlighting("Bash");
        mainPageSecond.selectPasteExpiration();
        mainPageSecond.writeTextInToPasteNameField(textForPasteName);
        mainPageSecond.pressCreateNewPasteButton();
        mainPageSecond.checkPasteNameMath(textForPasteName);
    }

    @Test
    public void checkSyntaxHighlightedForBash() {
        String textForPasteField = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String textForPasteName = "how to gain dominance among developers";
        String textForSyntaxHighlighting = "Bash";
        mainPageSecond.openPage();
        mainPageSecond.writeTextInToNewPasteField(textForPasteField);
        mainPageSecond.selectSyntaxHighlighting(textForSyntaxHighlighting);
        mainPageSecond.selectPasteExpiration();
        mainPageSecond.writeTextInToPasteNameField(textForPasteName);
        mainPageSecond.pressCreateNewPasteButton();
        mainPageSecond.checkTextOnSyntaxButton(textForSyntaxHighlighting);
    }

    @Test
    public void checkRavPasteDataTextMatchNewPasteText() {
        String textForPasteField = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String textForPasteName = "how to gain dominance among developers";
        String textForSyntaxHighlighting = "Bash";
        mainPageSecond.openPage();
        mainPageSecond.writeTextInToNewPasteField(textForPasteField);
        mainPageSecond.selectSyntaxHighlighting(textForSyntaxHighlighting);
        mainPageSecond.selectPasteExpiration();
        mainPageSecond.writeTextInToPasteNameField(textForPasteName);
        mainPageSecond.pressCreateNewPasteButton();
        mainPageSecond.checkTextInRawPasteDataField(textForPasteField);
    }
}