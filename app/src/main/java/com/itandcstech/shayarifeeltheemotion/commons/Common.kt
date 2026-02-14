package com.itandcstech.shayarifeeltheemotion.commons

import com.itandcstech.shayarifeeltheemotion.R
import com.itandcstech.shayarifeeltheemotion.models.ShayariModel

/**
 * @Created by Ashif on 11-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */


fun getList(): List<ShayariModel> {
    return listOf(
        ShayariModel(
            R.raw.love, "Love", listOf(
                "Tumhari yaad ke saaye mere dil ke andhero mein, diye ki lau ki tarah har pal chamakte hain.",
                "Mohabbat mein jhukna koi gunah nahi, chupta wahi hai jisme noor hota hai.",
                "Ishq wo nahi jo tujhe mera kar de, ishq wo hai jo tujhe kisi aur ka hone na de.",
                "Tere muskurane ka asar kuch aisa hua, ke hum khud ko bhool kar tere ho gaye.",
                "Dhadkano ko bhi raasta mil gaya, jab se tum meri zindagi mein aaye ho."
            )
        ), ShayariModel(
            R.raw.sad, "Sadness", listOf(
                "Kabhi kabhi rona bhi zaroori hota hai, dil ka bojh halka karne ke liye.",
                "Udasi ka koi mausam nahi hota, ye toh bas dil ki ek halat hai.",
                "Aansu wo shabd hain jo dil keh nahi pata.",
                "Khamoshi ka matlab har baar inkar nahi hota, kabhi kabhi dard bhi hota hai.",
                "Waqt har zakhm ko bhar deta hai, par nishan reh jate hain."
            )
        ), ShayariModel(
            R.raw.friend, "Friendship", listOf(
                "Dosti wo nahi jo mita di jaye, dosti wo hai jo har mushkil mein nibhai jaye.",
                "Ek sacha dost wahi hai, jo tab sath de jab puri duniya khilaf ho.",
                "Zindagi mein dost milte hain kismat se, aur unhe nibhana parta hai dil se.",
                "Dosti ka rishta sabse pyara hai, ye wo kinara hai jo tufan mein sahara hai.",
                "Dost wo hai jo aapki aankhon mein aansu dekh kar kahe, 'Ruk main abhi aata hoon'."
            )
        ), ShayariModel(
            R.raw.attitude, "Attitude", listOf(
                "Hum wo nahi jo duniya ko dekh kar badalte hain, hum wo hain jise dekh kar duniya badalti hai.",
                "Sher apni takat se raja banta hai, jungle mein chunav nahi hote.",
                "Mera waqt bura ho sakta hai, par main nahi.",
                "Zindagi apni sharton par jeeni chahiye, duniya ki rai toh har pal badalti hai.",
                "Hum khamosh kya hue, logon ne samjha hum haar gaye."
            )
        ), ShayariModel(
            R.raw.motivation, "Motivation", listOf(
                "Manzil mile na mile ye toh muqaddar ki baat hai, hum koshish hi na karein ye toh galat baat hai.",
                "Hausle ke tarkash mein koshish ka wo teer zinda rakho.",
                "Jeetne ka maza tabhi aata hai, jab sab aapke haarne ka intezar kar rahe hon.",
                "Girkar sambhalne wale ko hi baazigar kehte hain.",
                "Waqt badalta hai, aaj bura hai toh kal accha bhi aayega."
            )
        ), ShayariModel(
            R.raw.broken, "Broken Heart", listOf(
                "Dil tutne ki awaaz nahi hoti, par dard bahut hota hai.",
                "Humne toh dil diya tha rehne ke liye, unhone toh ise todkar rasta hi badal liya.",
                "Kaanch ki tarah tut gaya hai dil mera, ab har tukda chubhne laga hai.",
                "Mohabbat ka nateeja aksar judai hota hai, dil wahi rota hai jahan wafa hoti hai.",
                "Umeed jab tut-ti hai, toh insaan andar se bikhar jata hai."
            )
        ), ShayariModel(
            R.raw.god, "Devotion", listOf(
                "Tere dar par jo bhi aaya, khali hath kabhi na gaya.",
                "Bharosa us par rakho jo har pal sath hai, insaan toh bas waqt ka mohtaj hai.",
                "Khuda se jab bhi mangoge, wo itna dega ki tum thak jaoge.",
                "Teri rehmat ka silsila har pal jaari hai, tu hi mera maalik tu hi mera vaari hai.",
                "Dil mein khuda ho toh raaste apne aap ban jate hain."
            )
        ), ShayariModel(
            R.raw.life, "Life", listOf(
                "Zindagi ek safar hai suhana, yahan kal kya ho kisne jaana.",
                "Jeena seekho har haal mein, dukh ho ya sukh har saal mein.",
                "Zindagi haseen hai isse pyar karo, har raat ki subah ka intezar karo.",
                "Log kya kahenge ye mat socho, tum kya chahte ho bas wo karo.",
                "Zindagi ke har mod par sabr rakho, sukoon mil jayega."
            )
        ), ShayariModel(
            R.raw.mother, "Mother", listOf(
                "Maa ki mamta ka koi mol nahi, duniya mein aisa koi bol nahi.",
                "Jannat agar dekhni hai, toh maa ke pairon mein dekho.",
                "Maa wo hai jo sabki jagah le sakti hai, par uski jagah koi nahi le sakta.",
                "Duniya ki har khushi feeki hai, maa ki ek muskurahat ke aage.",
                "Ghar tab tak ghar hai, jab tak wahan maa hai."
            )
        ), ShayariModel(
            R.raw.mother/*father*/, "Father", listOf(
                "Pita wo darakht hai jiski chhaon mein pura parivar sukoon pata hai.",
                "Papa ka pyar dikhta nahi, par unke bina ghar chalta nahi.",
                "Ungli pakad kar chalna sikhaya, har mushkil se ladna sikhaya.",
                "Pita ka kandha duniya ka sabse majboot sahara hai.",
                "Khushnaseeb hain wo jinke sar par pita ka saya hai."
            )
        ), ShayariModel(
            R.raw.mother/*angry*/, "Anger", listOf(
                "Gussa woh tez dhaar hai jo rishton ko kaat deta hai.",
                "Jab gussa aaye toh khamosh ho jao, kyunki bolne par sirf pachtawa hota hai.",
                "Kamyabi wahi pata hai jo apne gusse ko peena seekh leta hai.",
                "Gusse mein di gayi dua aur baddua, dono hi dil se nahi hoti.",
                "Apne gusse ko hausle mein badlo, jeet tumhari hogi."
            )
        ), ShayariModel(
            R.raw.mother/*hope*/, "Hope", listOf(
                "Andheri raat ke baad hi haseen sawera hota hai.",
                "Umeed ka diya kabhi bujhne mat dena, yahi rasta dikhayega.",
                "Ek naya din, ek nayi umeed lekar aata hai.",
                "Sapne wahi dekhte hain jinme unhe pura karne ka junoon hota hai.",
                "Haar ke baad hi jeet ka maza aata hai."
            )
        ), ShayariModel(
            R.raw.mother/*nature*/, "Nature", listOf(
                "Fizaon mein ek ajeeb sa sukoon hai, qudrat ka ye rang kitna haseen hai.",
                "Pahadon ki khamoshi bahut kuch kehti hai, bas sunne wala dil chahiye.",
                "Baarish ki boondein dil ko ek naya ehsaas deti hain.",
                "Darakhto ki sarsarahat mein bhi ek sangeet hai.",
                "Phoolon ki khushbu har gham ko bhula deti hai."
            )
        ), ShayariModel(
            R.raw.mother/*success*/, "Success", listOf(
                "Mehnat itni khamoshi se karo ki kamyabi shor macha de.",
                "Mushkilein unhi ko milti hain jo bade khwaab dekhte hain.",
                "Kamyabi ka rasta mushkil ho sakta hai, par manjil bahut pyari hoti hai.",
                "Tab tak mat ruko jab tak manzil na mil jaye.",
                "Sapne sach hote hain, bas unhe sach karne ki zid honi chahiye."
            )
        ), ShayariModel(
            R.raw.mother/*lonely*/, "Loneliness", listOf(
                "Tanhai mein aksar purani yaadein rula deti hain.",
                "Akela hona bura nahi hai, bura toh kisi ke sath hokar bhi akela hona hai.",
                "Raat ki khamoshi mujhse aksar tera naam puchti hai.",
                "Apni tanhai se dosti kar lo, ye kabhi dhokha nahi degi.",
                "Bheed mein toh sab sath hain, par tanhai mein sirf khud ka sath hota hai."
            )
        ), ShayariModel(
            R.raw.mother/*funny*/, "Funny", listOf(
                "Duniya mein aaye ho toh thoda has bhi liya karo, rone ke liye toh padosi kafi hain.",
                "Padhai toh humne bahut ki, par exams ne humein kabhi nahi samjha.",
                "Dost wahi hai jo aapka mazaak udaye, par dukh mein sabse pehle aaye.",
                "Pyar wo dhokha hai jisme har koi hans kar girta hai.",
                "Zindagi mein chill karo, tension lene ke liye biwi kafi hai (Just kidding!)."
            )
        ), ShayariModel(
            R.raw.mother/*morning*/, "Good Morning", listOf(
                "Suraj ki pehli kiran aapke chehre par khushi laye.",
                "Subah ka har pal haseen ho, har dua aapke naseeb ho.",
                "Nayi subah, naya din, hamesha muskurate raho bina gin.",
                "Utho aur dekho qudrat ka ye karishma, aaj ka din aapka hai.",
                "Ek pyari si smile ke sath din ki shuruat karein."
            )
        ), ShayariModel(
            R.raw.mother/*night*/, "Good Night", listOf(
                "Sone se pehle sabko maaf karke so jao, dil ko sukoon milega.",
                "Chand ki chandni aur taaron ki barat, mubarak ho aapko ye haseen raat.",
                "Meethay sapno mein kho jao, kal ek naya sawera hoga.",
                "Raat ki khamoshi aapko thandi neend de.",
                "Shabb-khair, khwaabon ki duniya mein milte hain."
            )
        ), ShayariModel(
            R.raw.mother/*trust*/, "Trust", listOf(
                "Bharosa us par karo jo aapki teen baatein samajh sake: muskurahat ke peeche ka dard, gusse ke peeche ka pyar, aur khamoshi ke peeche ki wajah.",
                "Rishte vishwas par tike hote hain, shak toh unhe tod deta hai.",
                "Bharosa jeetne mein saalon lagte hain, par tutne mein ek pal.",
                "Kisi ka bharosa mat todna, kyunki ye kaanch ki tarah hota hai.",
                "Khud par vishwas rakho, duniya aap par vishwas karegi."
            )
        ), ShayariModel(
            R.raw.mother/*gratitude*/, "Gratitude", listOf(
                "Shukriya ada karo har us cheez ka jo tumhare paas hai.",
                "Jo mil gaya wo kafi hai, jo nahi mila uski fariyaad nahi.",
                "Sukoon wahi hai jahan shukr hai.",
                "Khuda ne jitna diya hai, wo meri aukaat se zyada hai.",
                "Har saans par shukriya kaho, zindagi haseen lagegi."
            )
        )
    )
}
