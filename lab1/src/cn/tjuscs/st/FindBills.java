package cn.tjuscs.st;

public class FindBills {
    public boolean findOrNot(int aquire)
    {
        if(aquire > 93){
            return false;
        }
        if(aquire >= 50)
        {
            aquire-=50;
        }
        if(aquire >=20)
        {
            aquire-=20;
        }
        if(aquire >=10){
            aquire -=10;
        }
        if(aquire >=5){
            aquire -=5;
        }
        if(aquire >=5){
            aquire -=5;
        }
        for (int i=0; i<3; ++i){
            if (aquire>=1){
                aquire -=1;
            }
        }
        if(aquire==0) {
            return true;
        }else{
            return false;
        }
    }
}
