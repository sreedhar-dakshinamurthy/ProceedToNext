package actions;

import pages.SecondPage;

/**
 * Created by sdakshin on 30/08/15.
 */
public class SecondPageActions extends UserJourney{

    private SecondPage secondPage = null;

    public SecondPageActions(){
        secondPage = new SecondPage();
    }

    public ThirdPageActions ProceedToNext(){
        return ProceedToThirdPage();
    }

    public ThirdPageActions ProceedToThirdPage(){
        secondPage.ProceedToThirdPage();
        return new ThirdPageActions();
    }
}
