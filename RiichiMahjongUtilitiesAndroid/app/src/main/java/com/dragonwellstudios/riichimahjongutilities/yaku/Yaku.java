package com.dragonwellstudios.riichimahjongutilities.yaku;

import com.dragonwellstudios.riichimahjongutilities.R;

/**
 * Created by lukepowell on 12/22/16.
 */

public enum Yaku {
    TSUMO(R.string.tsumo_localized, R.string.tsumo_description, R.string.tsumo_kanji, 1),
    RIICHI(R.string.riichi_localized, R.string.riichi_description, R.string.riichi_kanji, 1),
    IPPATSU(R.string.ippatsu_localized, R.string.ippatsu_description, R.string.ippatsu_kanji, 1),
    PINFU(R.string.pinfu_localized, R.string.pinfu_description, R.string.pinfu_kanji, 1),
    IIPEIKOU(R.string.iipeikou_localized, R.string.iipeikou_description, R.string.iipeikou_kanji, 1),
    HAITEI_RAOYUE(R.string.haitei_raoyue_localized, R.string.haitei_raoyue_description, R.string.haitei_raoyue_kanji, 1, 1, false),
    HOUTEI_RAOYUI(R.string.houtei_raoyui_localized, R.string.houtei_raoyui_description, R.string.houtei_raoyui_kanji, 1, 1, false),
    RINSHAN_KAIHOU(R.string.rinshan_kaihou_localized, R.string.rinshan_kaihou_description, R.string.rinshan_kaihou_kanji, 1, 1, false),
    CHANKAN(R.string.chankan_localized, R.string.chankan_description, R.string.chankan_kanji, 1, 1, false),
    TANYO(R.string.tanyao_localized, R.string.tanyao_description, R.string.tanyao_kanji, 1, 1, false),
    CHANTAIYAO(R.string.chantaiyao_localized, R.string.chantaiyao_description, R.string.chaintaiyao_kanji, 1, 2, false);

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
