package interfaceSample;

public interface FareType {
        /**
        * 運賃の割引処理
        *
        * @param fare 運賃
        * @return 割引後の運賃
        */
        int discount(int fare);

        /**
        * 運賃区分ラベルを取得
        *
        * @return 運賃区分ラベル
        */
        String getFareTypeLabel();
}
