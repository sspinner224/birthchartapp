import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CafeAstrologyUtility {

    private static String srcValue;

    public static String getSrcValue() {
        return srcValue;
    }

    public static CafeAstrologyData getInfo(AstrologyInfo info) {
        RequestFormParams params = new RequestFormParams();
//        params.addParam("name", info.getNameValue());
//        params.addParam("month", String.valueOf(info.getBirthMonth()));
//        params.addParam("day", String.valueOf(info.getBirthDay()));
//        params.addParam("year", String.valueOf(info.getBirthYear()));
//        params.addParam("hour", String.valueOf(info.getBirthTime()));

        params.addParam("name", "Alex");
        params.addParam("month", "2");
        params.addParam("day", "11");
        params.addParam("year", "1994");
        params.addParam("hour", "06");

//        System.out.println(info.getNameValue());
//        System.out.println(String.valueOf(info.getBirthMonth()));
//        System.out.println(String.valueOf(info.getBirthDay()));
//        System.out.println(String.valueOf(info.getBirthYear()));
//        System.out.println(String.valueOf(info.getBirthTime()));

        params.addParam("minute", "00");
        params.addParam("zp-report-variation", "birthreport");
        params.addParam("place", "New Hyde Park, New York, United States");
        params.addParam("geo_timezone_id", "America/New_York");
        params.addParam("zp_lat_decimal", "40.7351");
        params.addParam("zp_long_decimal", "-73.68791");
        params.addParam("zp_offset_geo", "-5");
        params.addParam("action", "zp_birthreport");

        RequestHeaders headers = new RequestHeaders();
        headers.addHeader("accept", "*/*");
        headers.addHeader("accept-language", "en-US,en;q=0.9");
        headers.addHeader("content-type", "application/x-www-form-urlencoded");
        headers.addHeader("origin", "https://cafeastrology.com");
        headers.addHeader("referer", "https://cafeastrology.com/free-natal-chart-report.html");
        headers.addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36");

        Response response = HttpRequest.post("https://cafeastrology.com/wp-admin/admin-ajax.php", params, headers);
     //   System.out.println(response);

        String report = response.getBody().getAsJsonObject().get("report").toString();
     //   System.out.println(report);

        Document document = Jsoup.parse(report);
        String doc = document.toString().replaceAll("\\&quot;", "");
        Document document2 = Jsoup.parse(doc);
      //  System.out.println(document2);
        Elements signs = document2.getElementsByClass("\\zp-subheading\\");
      //  System.out.println(signs);
//        System.out.println(signs.get(0));
//        System.out.println(signs.get(1));
//        System.out.println(signs.get(2));
//        System.out.println(signs.get(3));
//        System.out.println(signs.get(4));
//        System.out.println(signs.get(5));
//        System.out.println(signs.get(6));
//        System.out.println(signs.get(7));
//        System.out.println(signs.get(8));
//        System.out.println(signs.get(9));
//        System.out.println(signs.get(10));
        //Elements ps = document.body().getElementsByTag("p");
        //System.out.println(ps);

        String sun = signs.get(0).text();
        String rising = signs.get(1).text();
        String moon = signs.get(2).text();
        String mercury = signs.get(3).text();
        String venus = signs.get(4).text();
        String mars = signs.get(5).text();
        String jupiter = signs.get(6).text();
        String saturn = signs.get(7).text();
        String uranus = signs.get(8).text();
        String neptune = signs.get(9).text();
        String pluto = signs.get(10).text();

        String sunSign = getSign(sun);
        String risingSign = getSign(rising);
        String moonSign = getSign(moon);
        String mercurySign = getSign(mercury);
        String venusSign = getSign(venus);
        String marsSign = getSign(mars);
        String jupiterSign = getSign(jupiter);
        String saturnSign = getSign(saturn);
        String uranusSign = getSign(uranus);
        String neptuneSign = getSign(neptune);
        String plutoSign = getSign(pluto);
      //  String image = get

        System.out.println(sunSign);
//        System.out.println("Your moon sign is " + moonSign);
//        System.out.println("Your rising sign is " + risingSign);
//        System.out.println("Your mercury sign is " + mercurySign);
//        System.out.println("Your venus sign is " + venusSign);
//        System.out.println("Your mars sign is " + marsSign);
//        System.out.println("Your jupiter sign is " + jupiterSign);
//        System.out.println("Your saturn sign is " + saturnSign);
//        System.out.println("Your uranus sign is " + uranusSign);
//        System.out.println("Your neptune sign is " + neptuneSign);
//        System.out.println("Your pluto sign is " + plutoSign);

        String imageBase64Encoded = response.getBody().getAsJsonObject().get("image").toString();
        //    System.out.println(imageBase64Encoded);

        Document documentImage = Jsoup.parse(imageBase64Encoded);
        String docImage = documentImage.toString().replaceAll("\\&quot;", "");
        Document documentImage2 = Jsoup.parse(docImage);
        //     System.out.println(documentImage2);
        Element image = documentImage2.getElementsByTag("img").first();
        String url = image.absUrl("src");
        srcValue = image.attr("src");
        //System.out.println(srcValue);

        CafeAstrologyData cafeAstrologyData = new CafeAstrologyData(sunSign, risingSign, moonSign,mercurySign,venusSign,
                marsSign, jupiterSign, saturnSign, uranusSign, neptuneSign, plutoSign, srcValue);

        return cafeAstrologyData;
    }


    public static String getSign(String text) {
        if(text.contains("Aries")){
            return "Aries";
        } else if (text.contains("Taurus")) {
            return "Taurus";
        } else if (text.contains("Gemini")) {
            return "Gemini";
        } else if (text.contains("Cancer")) {
            return "Cancer";
        } else if (text.contains("Leo")) {
            return "Leo";
        } else if (text.contains("Virgo")) {
            return "Virgo";
        } else if (text.contains("Libra")) {
            return "Libra";
        } else if (text.contains("Scorpio")) {
            return "Scorpio";
        } else if (text.contains("Sagittarius")) {
            return "Sagittarius";
        } else if (text.contains("Capricorn")) {
            return "Capricorn";
        } else if (text.contains("Aquarius")) {
            return "Aquarius";
        } else if (text.contains("Pisces")) {
            return "Pisces";
        }
        return null;
    }





}
