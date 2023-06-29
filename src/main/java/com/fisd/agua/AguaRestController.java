//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.fisd.agua;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AguaRestController {
    public AguaRestController() {
    }

    @PostMapping({"submit"})
    public UserResults SubmitForm(@RequestBody UserConsumption request) {
        System.out.println(request.getToiletPercentage());
        System.out.println();
        System.out.println(request.getWashingMachinePercentage());
        System.out.println();
        System.out.println(request.getShowerPercentage());
        System.out.println();
        System.out.println(request.getFaucetPercentage());
        System.out.println();
        System.out.println(request.getDishWasherPercentage());
        System.out.println();
        System.out.println(request.getDishFaucetPercentage());

        UserResults results = new UserResults();

        if(request.toiletisabove()) {
            results.addErrorFinds("above toilet usage");
            results.addUsefulLink("https://www.angi.com/articles/how-can-i-keep-my-toilet-wasting-water.htm\n");
            results.addUsefulLink("https://www.thespruce.com/how-to-convert-any-toilet-to-a-low-flow-toilet-1388727\n");
            results.addUsefulLink("https://www.conservationmart.com/blog/index.php/5-ways-to-save-water-in-the-toilet-2/\n");

        }
        else results.addErrorFinds("good toilet usage");

        if(request.WashingMachineisabove()){
            results.addErrorFinds("above washing machine usage");
            results.addUsefulLink("https://linthicumplumbing.net/blog/2018/9/20/six-ways-to-stop-wasting-water-with-your-washing-machine\n");
            results.addUsefulLink("https://wateruseitwisely.com/blog/laundryroom/\n");
            results.addUsefulLink("https://www.choice.com.au/home-and-living/laundry-and-cleaning/washing-machines/articles/best-washing-machine-for-saving-water\n");
        }
        else results.addErrorFinds("good washing machine usage");

        if(request.DishFaucetisabove()){
            results.addErrorFinds("above dish faucet usage");
            results.addUsefulLink("https://www.wikihow.com/Conserve-Water-when-Doing-Dishes#:~:text=Fill%20the%20sink%20with%20warm,or%20loses%20all%20its%20suds.\n");
            results.addUsefulLink("angi.com/articles/how-to-use-less-water-when-you-wash-dishes.htm\n");
            results.addUsefulLink("https://www.frugalandthriving.com.au/how-to-hand-wash-dishes-using-minimal-water/\n");
        }
        else results.addErrorFinds("good dish faucet usage");

        if(request.DishWasherisabove()){
            results.addErrorFinds("above dish washer usage");
            results.addUsefulLink("https://www.savewatersavemoney.co.uk/water-efficiency-tips-advice/view/103/how-to-save-water-while-using-a-dishwasher.html\n");
            results.addUsefulLink("https://danamark.com/resources/water-usage-commercial-dishwashers/\n");
            results.addUsefulLink("https://www.wikihow.com/Conserve-Water-when-Doing-Dishes\n");
        }
        else results.addErrorFinds("good dish washer usage");

        if(request.faucetisabove()){
            results.addErrorFinds("above restroom faucet usage");
            results.addUsefulLink("https://www.watercalculator.org/posts/bathroom-sink/\n");
            results.addUsefulLink("https://www.bobvila.com/articles/low-flow-faucets/\n");
        }
        else results.addErrorFinds("good restroom faucet usage");

        if(request.Showerisabove()){
            results.addErrorFinds("above shower usage");
            results.addUsefulLink("https://www.lowes.com/n/how-to/ways-conserve-water\n");
            results.addUsefulLink("https://www.therighttoshower.com/ethical-living/3-things-you-can-do-to-save-water-in-the-shower\n");
            results.addUsefulLink("https://stories.oras.com/en/4-easy-ways-to-save-water-in-the-shower\n");
            results.addUsefulLink("https://www.rotorooter.com/frequently-asked-questions/plumbing/what-can-be-done-to-save-water-when-i-shower/\n");

        }
        else results.addErrorFinds("good shower usage");

        return results;
    }
}