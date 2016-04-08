package com.example.administrator.divination.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/3/29.
 */
public class StartYearBean {

    /**
     * love : ["总体而言，本年度的感情运大体平顺，波澜无惊。上半年单身人士有机会通过家人介绍认识一些异性，也会有一些意外火花出现，但较难进入稳定关系。3月份会是关键月份，可能在朋友聚会之间遇见让自己心动不已的异性，但两人感觉多数趋于暧昧而难以步入现实关系，更像是了结一段前缘。而从4月伊始到5月中旬，则是对已有感情充满挑战的时间，你会因为对方的缘故而忙碌不已，而双方也容易因为固执而闹不开心，如果双方都愿意多一些探讨余地就能有惊无险度过。进入下半年，木星来到感情宫，将会给单身人士带来不少追求者，但却可能都有或多或少的小毛病，主要还看自身选择。整个秋天都是感情宫相对活跃的时期，单身人士可以抓紧机会，而有伴者则可以考虑在这段时间进行备孕，若无计划则应尤其小心意外中标。"]
     * future : [""]
     * name : 金牛座
     * career : ["2016年还是为未来筹备的一年。你的生活已经基本开始稳定，也会对事业有着更多的想法，但始终欲速则不达，一些长远的计划可以在此时开始，却要更多的时间经营才能慢慢看到起色。你可能还会因为贷款而背负债务，在事业上也要根据现实状况不断调整自己的方向和预期。对创业者而言，这会是投入多于产出的一年，但却也不得不以相信未来会很好的决心去努力耕耘，刚开始的时候也许反应平平、看天吃饭，但长远来言却是不得不经历的过程。自由职业者在2016年相对较为辛苦，多数时间只能承担一些辅助工作，或是自己的作品沦为他人附属，较难被大众看到和接受，偶有表现也相对小众而难以真正叫座。打工者也相对辛劳，须得按照上级指示奔波于各种危机状况之中，上半年相对轻松却情绪不稳，下半年虽更易被重用，但多数也仅是表面风光，并没有太多实质升迁和物质奖励。"]
     * error_code : 0
     * year : 2016
     * resultcode : 200
     * finance : ["对你们而言，今年要分为收入和债务两方面来看。部分金牛座可能会在2015年因为置产或是家人而背负债务，但好在金额还在自身可以承担范围之中，不胡乱折腾就不会以对生活构成威胁。全年来看，金牛的收入基本稳定，不会出现类似去年这样烂帐难收的状况，下半年财运会好于上半年。在上半年，你会有机会收回之前一直被拖延的奖金和借款，尤其在房屋租赁和销售方面都会有资金入账。5月初要小心收支失衡，弹尽粮绝。但此后的5、6月会是财运相对较好的时间，虽然也会因为很多别人的事情而忙得不可开交，同时也能有不错的收入来源，包括一些欠款都可能收回。8月木星进入处女座之后将会激发你们的投资欲望，但如果贪心太盛，结果恐怕远不如预期美好。倒是正财一直还算不错，下半年勤力工作都会带来令人满意的现金流。"]
     * health : ["不要长时间使用手机，时间一久腕关节会很辛苦的。"]
     * date : 2016年
     * mima : {"text":["在过去一年中，很多金牛座都因为婚姻或是合作而背负压力，必须不断付出才能让关系保持稳定。而在2016年中，压力还会继续，所不同的是此前错综复杂的财务状况基本划割清楚，该放手的损失也已经放下，个人从此前的前景未明而变成为特定目标而努力。部分金牛座可能会因为买房背负贷款，或是为了给对方还钱而加倍努力，但稳定的关系却会让你们心中踏实、信心百倍。整体而言，上半年木星还在狮子座让你们会消耗较多精力在家人和住房方面，或是为家人奔波，或是装修房屋将耗费去大量精力。但在3月间，会有机会认识很多有趣的朋友，带来新的生活启迪，展开不一样的生活念想。下半年，木星进入处女座则会让你们走出家庭的局限性，参加更多社交活动和有趣的事情，将此前的很多想法具体化，计划也将逐渐铺开，以精湛的技能获得一席之地。特别注意7月下旬至9月上旬，命主金星会在家宅宫逆行，让你必须重新再去关注那些以为处理好的，与房屋、家人有关的事宜，适合收账，但若随意决策也易破财。"],"info":"背负压力的前行之年"}
     * luckyStone : 紫黄晶
     */
    private List<String> love;
    private List<String> future;
    private String name;
    private List<String> career;
    private int error_code;
    private int year;
    private String resultcode;
    private List<String> finance;
    private List<String> health;
    private String date;
    private MimaEntity mima;
    private String luckyStone;

    public void setLove(List<String> love) {
        this.love = love;
    }

    public void setFuture(List<String> future) {
        this.future = future;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCareer(List<String> career) {
        this.career = career;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public void setFinance(List<String> finance) {
        this.finance = finance;
    }

    public void setHealth(List<String> health) {
        this.health = health;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMima(MimaEntity mima) {
        this.mima = mima;
    }

    public void setLuckyStone(String luckyStone) {
        this.luckyStone = luckyStone;
    }

    public List<String> getLove() {
        return love;
    }

    public List<String> getFuture() {
        return future;
    }

    public String getName() {
        return name;
    }

    public List<String> getCareer() {
        return career;
    }

    public int getError_code() {
        return error_code;
    }

    public int getYear() {
        return year;
    }

    public String getResultcode() {
        return resultcode;
    }

    public List<String> getFinance() {
        return finance;
    }

    public List<String> getHealth() {
        return health;
    }

    public String getDate() {
        return date;
    }

    public MimaEntity getMima() {
        return mima;
    }

    public String getLuckyStone() {
        return luckyStone;
    }

    public class MimaEntity {
        /**
         * text : ["在过去一年中，很多金牛座都因为婚姻或是合作而背负压力，必须不断付出才能让关系保持稳定。而在2016年中，压力还会继续，所不同的是此前错综复杂的财务状况基本划割清楚，该放手的损失也已经放下，个人从此前的前景未明而变成为特定目标而努力。部分金牛座可能会因为买房背负贷款，或是为了给对方还钱而加倍努力，但稳定的关系却会让你们心中踏实、信心百倍。整体而言，上半年木星还在狮子座让你们会消耗较多精力在家人和住房方面，或是为家人奔波，或是装修房屋将耗费去大量精力。但在3月间，会有机会认识很多有趣的朋友，带来新的生活启迪，展开不一样的生活念想。下半年，木星进入处女座则会让你们走出家庭的局限性，参加更多社交活动和有趣的事情，将此前的很多想法具体化，计划也将逐渐铺开，以精湛的技能获得一席之地。特别注意7月下旬至9月上旬，命主金星会在家宅宫逆行，让你必须重新再去关注那些以为处理好的，与房屋、家人有关的事宜，适合收账，但若随意决策也易破财。"]
         * info : 背负压力的前行之年
         */
        private List<String> text;
        private String info;

        public void setText(List<String> text) {
            this.text = text;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public List<String> getText() {
            return text;
        }

        public String getInfo() {
            return info;
        }
    }

    @Override
    public String toString() {
        return "StartYearBean{" +
                "love=" + love +
                ", future=" + future +
                ", name='" + name + '\'' +
                ", career=" + career +
                ", error_code=" + error_code +
                ", year=" + year +
                ", resultcode='" + resultcode + '\'' +
                ", finance=" + finance +
                ", health=" + health +
                ", date='" + date + '\'' +
                ", mima=" + mima +
                ", luckyStone='" + luckyStone + '\'' +
                '}';
    }
}
