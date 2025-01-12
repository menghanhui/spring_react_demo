package react.backend;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class ArrayObject {

    private int[] cash;
    private int[] longTermAsset;
    private int[] debt;
    private int[] liabilities;

    public int[] getCash(){
        return cash;
    }


    public void setCash(int[] cash){
       this.cash = cash;
    }

    public int[] getLongTermAsset(){
        return longTermAsset;
    }

    public void setLongterm(int[] longterm){
        this.longTermAsset = longterm;
    }

    public int[] getDebt(){
        return debt;
    }

    public void setDebt(int[] debt){
        this.debt = debt;
    }

    public int[] getLiabilities(){
        return liabilities;
    }

    public void setLiab(int[] liab){
        this.liabilities = liab;
    }

    public int[] result() throws Exception {
        int asset = 0;

        if (cash!=null) {
            for (int i : cash) {
                if(i < 0){
                    throw new Exception("it cannot be negative");
                }
                asset += i;
            }
        }


        if (longTermAsset!= null) {
            for (int i : longTermAsset) {
                asset += i;
            }
        }

        int lia = 0;
        if(debt != null) {
            for (int i : debt) {
                lia += i;
            }
        }


        if(liabilities != null) {
            for (int i : liabilities) {
                lia += i;
            }
        }

        int[]result = new int[3];
        result[0] = asset;
        result[1] = lia;
        result[2] = asset-lia;

        return result;

    }

}

