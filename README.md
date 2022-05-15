# webflux-test

    @Query("select o.opportunityCodeEntity ,sum(o.expectedAmount), sum(o.expected_amt*c.cd_nm::integer)/100 " +
            "from OpportunityEntity o " +
            "where o.yearOfEnd = 2022 " +
            "between c.name = :#{#p1} and c.name = :#{#p2}" +
            "and o.client_name <> :#{#clientName} " +
            "group by o.opportunity_cd; ")
    List<OpportunityResponse> getee(int p1, int p2, String clientName, int year);



https://miinsun.tistory.com/229

https://gareen.tistory.com/44
