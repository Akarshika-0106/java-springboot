package codingpractice.LowLevelDesign.AskedInInterviews.MakeMyTrip.LLD1;

import java.util.ArrayList;
import java.util.List;

public class Engineer {
    List<Skill> skillList = new ArrayList<>();

    public void communicate(){
        System.out.println("Communicate efficiently with team");
    }

    public void setSkill(Skill skill){
        skillList.add(skill);
    }

    public void doWork(){
        if(skillList.isEmpty()){
            System.out.println("No skills assigned yet");
        }else{
            for(Skill skill: skillList){
                skill.performSkill();
            }
        }
    }
}
