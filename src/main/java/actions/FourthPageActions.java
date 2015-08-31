package actions;

import org.openqa.selenium.By;
import pages.FourthPage;

/**
 * Created by sdakshin on 30/08/15.
 */
public class FourthPageActions extends UserJourney{

    private FourthPage fourthPage = null;

    public FourthPageActions(){
        fourthPage = new FourthPage();
    }

    public FifthPageActions ProceedToNext(){
        return ProceedToFifthPage();
    }

    public FifthPageActions ProceedToFifthPage(){
        fourthPage.ProceedToFifthPage();
        return new FifthPageActions();
    }
}
