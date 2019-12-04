package ai.autonomic.test.services;

import javax.inject.Singleton;

@Singleton
public class PostCleanupService {


    public String crop(String message, Long maximumLength) {
        String cropped = "";
        if(message.length() > maximumLength){
            String[] words = message.split(" ");
            int i = 0;
            for(; i < words.length; i++) {
                String toAppend = words[i];
                if(i > 0){
                    toAppend = " "+words[i];
                }
                if((cropped+toAppend).length() <= maximumLength){
                    cropped += toAppend;
                }
            }

        }else{
            cropped =message;
        }
        return cropped.trim();
    }
}
