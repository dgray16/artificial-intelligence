import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 29.03.2016.
 */
public enum Ranks {

    CONSTABLE(14),
    CORPORAL(13),
    SERGEANT(12),
    STAFF_SERGEANT(11),
    JUNIOR_LIEUTENANT(10),
    LIEUTENANT(9),
    SENIOR_LIEUTENANT(8),
    CAPTAIN(7),
    MAJOR(6),
    LIEUTENANT_COLONEL(5),
    COLONEL(4),
    MAJOR_GENERAL(3),
    LIEUTENANT_GENERAL(2),
    COLONEL_GENERAL(1);

    private final Integer rankScore;
    public static ResourceBundle bundle;

    // Constructor
    Ranks(Integer rankScore){
        this.rankScore = rankScore;
    }

    public String getLocalizedRankType() throws UnsupportedEncodingException {
        return new String(bundle.getString(name()).getBytes("ISO-8859-1"), "Windows-1251");
    }

    public int getRankScore() {
        return rankScore;
    }
}
