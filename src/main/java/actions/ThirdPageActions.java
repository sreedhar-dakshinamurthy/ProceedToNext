package actions;

import pages.ThirdPage;

/**
 * Created by sdakshin on 30/08/15.
 */
public class ThirdPageActions extends UserJourney{
    private ThirdPage thirdPage = null;

    public ThirdPageActions(){
        thirdPage = new ThirdPage();
    }

    public FourthPageActions ProceedToNext(){
        return ProceedToFourthPage();
    }

    public FourthPageActions ProceedToFourthPage(){
        thirdPage.ProceedToFourthPage();
        return new FourthPageActions();
    }
}