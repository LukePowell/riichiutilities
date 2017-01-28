package com.dragonwellstudios.riichimahjongutilities.yaku;

import static com.dragonwellstudios.riichimahjongutilities.R.string.*;

/**
 * Created by lukepowell on 12/22/16.
 *
 * Simple enumeration to put together all the details of any given yaku in a reasonable manner
 */
public enum Yaku {
    TSUMO(tsumo, tsumo_description, tsumo_kanji, 1),
    RIICHI(riichi, riichi_description, riichi_kanji, 1),
    IPPATSU(ippatsu, ippatsu_description, ippatsu_kanji, 1),
    PINFU(pinfu, pinfu_description, pinfu_kanji, 1),
    IIPEIKOU(iipeikou, iipeikou_description, iipeikou_kanji, 1),
    HAITEI_RAOYUE(haitei_raoyue, haitei_raoyue_description, haitei_raoyue_kanji, 1, 1, false),
    HOUTEI_RAOYUI(houtei_raoyui, houtei_raoyui_description, houtei_raoyui_kanji, 1, 1, false),
    RINSHAN_KAIHOU(rinshan_kaihou, rinshan_kaihou_description, rinshan_kaihou_kanji, 1, 1, false),
    CHANKAN(chankan, chankan_description, chankan_kanji, 1, 1, false),
    TANYO(tanyao, tanyao_description, tanyao_kanji, 1, 1, false),
    CHANTAIYAO(chantaiyao, chantaiyao_description, chaintaiyao_kanji, 1, 2, false),
    SANSHOKU_DOUJUN(sanshoku_doujun, sanshoku_doujun_description, sanshoku_doujun_kanji, 1, 2, false),
    ITTSU(ittsu, ittsu_description, ittsu_kanji, 1, 2, false),
    TOITOI(toitoi, toitoi_description, toitoi_kanji, 2, 2, false),
    SANANKOU(sanankou, sanankou_description, sanankou_kanji, 2, 2, false),
    SANSHOKU_DOUKOU(sanshoku_doukou, sanshoku_doukou_description, sanshoku_doukou_kanji, 2, 2, false),
    SANKANTSU(sankantsu, sankantsu_description, sankantsu_kanji, 2, 2, false),
    CHIITOITSU(chiitoitsu, chiitoitsu_description, chiitoitsu_kanji, 0, 2, true),
    HONROUTOU(honroutou, honroutou_description, honroutou_kaniji, 2, 2, false),
    SHOUSANGEN(shousangen, shousangen_description, shousangen_kanji, 2, 2, false),
    HONITSU(honitus, honitsu_description, honitsu_kanji, 2, 3, false),
    JUNCHAN_TAIYAO(junchan_taiyao, junchan_taiyao_description, juchan_taiyao_kanji, 2, 3, false),
    RYANPEIKOU(ryanpeikou, ryanpeikou_description, ryanpeikou_kanji, 0, 3, true),
    CHINITSU(chinitsu, chinitsu_description, chinitsu_kanji, 5, 6, false),
    KAZOE_YAKUMAN(kazoe_yakuman, kazoe_yakuman_description, kazoe_yakuman_kanji, 13, 13, false),
    KOKUSHI_MUSOU(kokushi_musou, kokushi_musou_description, kokushi_mosou_kanji, 13, 13, true),
    SUUANKOU(suuankou, suuankou_description, suuankou_kanji, 13, 13, true),
    DAISANGEN(daisangen, daisangen_description, daisangen_kanji, 13, 13, false),
    SHOUSUUSHII(shosuushi, shosuushi_description, shosuushi_kanji, 13, 13, false),
    DAISUUSHIII(daisuushi, daisuushi_description, daisuushi_kanji, 13, 13, false),
    TSUUIISOU(tsuuiisou, tsuuiisou_description, tsuuiisou_kanji, 13, 13, false),
    CHINROUTOU(chinroutou, chinroutou_description, chinroutou_kanji, 13, 13, false),
    RYUUIISOU(ryuuiisou, ryuuiisou_description, ryuuiisou_kanji, 13, 13, false),
    CHUUREN_POUTOU(chuuren_poutou, chuuren_poutou_description, chuuren_poutou_kanji, 13, 13, true),
    SUUKANTSU(suukantsu, suukantsu_description, suukantsu_kanji, 13, 13, false),
    TENHOU(tenhou, tenhou_description, tenhou_kanji, 13, 13, true),
    CHIIHOU(chiihou, chiihou_description, chiihou_kanji, 13, 13, true),
    NAGASHI_MANGAN(nagashi_mangan, nagashi_mangan_description, nagashi_mangan_kanji, 5, 5, true);


    private int localizedName;
    private int localizedDescription;
    private int kanjiName;
    private int hanOpen;
    private int hanClosed;
    private boolean closedOnly = true;
    private boolean optional = false;

    Yaku(int localizedName, int localizedDescription, int kanjiName, int hanClosed) {
        this(localizedName, localizedDescription, kanjiName, 0, hanClosed, true);
    }

    Yaku(int localizedName, int localizedDescription, int kanjiName, int hanOpen, int hanClosed, boolean closedOnly) {
        this(localizedName, localizedDescription, kanjiName, hanOpen, hanClosed, closedOnly, false);
    }

    Yaku(int localizedName, int localizedDescription, int kanjiName, int hanOpen, int hanClosed, boolean closedOnly, boolean optional) {
        this.localizedName = localizedName;
        this.localizedDescription = localizedDescription;
        this.kanjiName = kanjiName;
        this.hanOpen = hanOpen;
        this.hanClosed = hanClosed;
        this.closedOnly = closedOnly;
        this.optional = optional;
    }

    public int getHanOpen() {
        return hanOpen;
    }

    public int getHanClosed() {
        return hanClosed;
    }

    public boolean isClosedOnly() {
        return closedOnly;
    }

    public int getLocalizedName() {
        return localizedName;
    }

    public int getLocalizedDescription() {
        return localizedDescription;
    }

    public int getKanjiName() {
        return kanjiName;
    }

    public boolean isOptional() {
        return optional;
    }
}
