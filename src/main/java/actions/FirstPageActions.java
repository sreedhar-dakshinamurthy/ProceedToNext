package actions;

import pages.FirstPage;

/**
 * Created by sdakshin on 30/08/15.
 */
public class FirstPageActions extends UserJourney{

    private FirstPage firstPage = null;

    public FirstPageActions(){
        firstPage = new FirstPage();
    }

    public SecondPageActions ProceedToNext(){
        return ProceedToSecondPage();
    }

    public SecondPageActions ProceedToSecondPage(){
        firstPage.ProceedToSecondPage();
        return new SecondPageActions();
    }
}
