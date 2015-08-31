package actions;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by sdakshin on 30/08/15.
 */
public class UserJourney {

    public UserJourney ProceedToNext(){
        throw new NotImplementedException();
    }

    public SecondPageActions ProceedToSecondPage(){
        return ProceedToNext().ProceedToSecondPage();
    }

    public ThirdPageActions ProceedToThirdPage(){
        return ProceedToNext().ProceedToThirdPage();
    }

    public FourthPageActions ProceedToFourthPage(){
        return ProceedToNext().ProceedToFourthPage();
    }

    public FifthPageActions ProceedToFifthPage(){
        return ProceedToNext().ProceedToFifthPage();
    }
}