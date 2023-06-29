package com.fisd.agua;
import java.util.ArrayList;
import java.util.List;
public class UserResults {
    private List<String> errorFinds = new ArrayList();
    private List<String> suggestions = new ArrayList();
    private List<String> usefullLinks = new ArrayList();

    public UserResults() {
        errorFinds = new ArrayList<>();
        usefullLinks = new ArrayList<>();
        suggestions = new ArrayList<>();
    }

    public void addErrorFinds(String find) {

        this.errorFinds.add(find);
    }



    public void addUsefulLink(String link) {
        this.usefullLinks.add(link);
    }


    public List<String> getErrors() {
        return this.errorFinds;
    }



    public List<String> getUsefulLinks() {
        return this.usefullLinks;
    }

}
