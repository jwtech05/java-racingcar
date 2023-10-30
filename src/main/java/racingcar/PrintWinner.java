package racingcar;

import java.util.ArrayList;
import java.util.List;

public class PrintWinner {

    RacingCar[] racingCars;

    public PrintWinner(RacingCar[] racingCars) {
        this.racingCars = racingCars;
    }

    private int winnerNum(){
        int wNum = 0;
        for(int i=0; i <racingCars.length; i++){
            wNum = Math.max(wNum, racingCars[i].getDistance());
        }
        return wNum;
    }

    private List<String> winnerList(){
        List<String> wList = new ArrayList<>();
        int wNum = winnerNum();
        for(int i = 0; i<racingCars.length; i++){
            if(wNum == racingCars[i].getDistance()){
                wList.add(racingCars[i].getName());
            }
        }
        return wList;
    }

    public String winnerListPrint(){
        List<String> wList = winnerList();
        StringBuilder wListText = new StringBuilder();
        wListText.append("최종 우승자 : "+wList.get(0));
        if(wList.size() > 1){
            for(int i=1; i<wList.size(); i++){
                wListText.append(", "+wList.get(i));
            }
        }
        return wListText.toString();
    }
}
