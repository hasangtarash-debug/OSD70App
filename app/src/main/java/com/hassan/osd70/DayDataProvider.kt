package com.hassan.oad70
object DayDataProvider {
    fun getDays(): List<Day> {        return listOf(
            // ------------------ روز ۱ ------------------            Day(                id = 1,                week = 1,                phase = "فاز ۱: تثبیت پایه",                focus = "خواندن",                grammar1Title = "Präsens: starke und unregelmäßige Verben",                grammar1Ex1 = "Der Techniker liest die Messwerte und fährt dann zum Kraftwerk.",                grammar1Ex2 = "Sie spricht fließend Deutsch und hilft ihren Kollegen beim Schreiben der Berichte.",                grammar2Title = "Perfekt mit haben und sein",                grammar2Ex1 = "Ich habe gestern den Transformator geprüft.",                grammar2Ex2 = "Wir sind am Montag nach Wien geflogen und haben dort eine Schulung besucht.",                goal = """تمرکز اصلی روز:- تمرین Präsens و Perfekt- انجام تمرین‌های رسمی گوته B2 در بخش Lesen و Hören- نوشتن یک Leserbrief با ساختار درست- تمرین گفتاری با ویدیو رسمی ÖSD
منابع روز:
Lesen:تمرین رسمی Goethe B2 – Teil 1 (Moderne Lebensformen)لینک: https://bfu.goethe.de/b2mod2MX6/lesen.php
Hören:تمرین رسمی Goethe B2 – Teil 1 (پنج گفت‌وگو کوتاه)لینک: https://bfu.goethe.de/b2mod2MX6/hoeren.php
Schreiben:ویدیو آموزشی Leserbrief (ساختار، محتوا، نکات)لینک: https://www.youtube.com/watch?v=jrZ1A_BLZZA
Sprechen:ویدیو رسمی آزمون شفاهی ÖSD B2لینک: https://www.youtube.com/watch?v=nFQljN4Oei"""            ),
            // ------------------ روز ۲ ------------------            Day(                id = 2,                week = 1,                phase = "فاز ۱: تثبیت پایه",                focus = "شنیدن",                grammar1Title = "Präteritum: regelmäßige und unregelmäßige Verben",                grammar1Ex1 = "Früher arbeitete er in einer kleinen Firma in Teheran.",                grammar1Ex2 = "Als der Strom ausfiel, ging ich sofort in den Keller und schaltete den Generator ein.",                grammar2Title = "Plusquamperfekt",                grammar2Ex1 = "Nachdem die Techniker die Anlage abgeschaltet hatten, begannen sie mit der Wartung.",                grammar2Ex2 = "Ich hatte schon drei Bewerbungen geschickt, bevor die erste Antwort kam.",                goal = """تمرکز اصلی روز:- تمرین دقیق Präteritum و Plusquamperfekt- انجام تمرین‌های شنیداری رسمی گوته B2- یادداشت‌برداری از خطاهای شنیداری- تمرین گفتاری با تمرکز بر ساختارهای گذشته
منابع روز:
Hören:تمرین رسمی Goethe B2 – گفت‌وگوهای کوتاهلینک: https://bfu.goethe.de/b2mod2MX6/hoeren.php
Schreiben:نوشتن یک متن کوتاه درباره «تجربهٔ کاری گذشته» با استفاده از Präteritum و Plusquamperfekt
Sprechen:تمرین گفتاری درباره «تغییرات شغلی در گذشته»"""            )
        )    }
    fun getDayById(id: Int): Day? = getDays().find { it.id == id }}
