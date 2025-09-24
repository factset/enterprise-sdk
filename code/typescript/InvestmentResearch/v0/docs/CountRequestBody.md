# investmentresearch.CountRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, ISIN, Entity ID and SEDOL.  | 
**startDate** | **Date** | Start Date. Format is YYYY-MM-DD. If the parameter is not provided, will return the today&#39;s results.  | [optional] 
**endDate** | **Date** | End Date. Format is YYYY-MM-DD. If the parameter is not provided, will return the today&#39;s results.  | [optional] 
**startDateRelative** | **Number** | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional] 
**endDateRelative** | **Number** | The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  | [optional] 
**sources** | **[String]** | Code for document source to include.  This is a comma-separated list. Available values:-     * FRC - FactSet Research Connect      * AMR - Aftermarket Research    If this parameter is not provided, data is queried from the entitled sources. | [optional] 
**timezone** | **String** | Returns a list of all time zones supported by the API, formatted in POSIX style (e.g., &#x60;America/New_York&#x60;, &#x60;Africa/Malabo&#x60;). These time zones are automatically adjusted for daylight saving time where applicable. This list is used for setting or converting story dates and times accurately across different regions. | [optional] [default to &#39;America/New_York&#39;]
**categories** | **[String]** | Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
**primaryId** | **Boolean** | Type of identifier search — set to true to search by primary identifier. | [optional] [default to false]
**searchText** | **String** | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well.  | [optional] 
**contributorId** | **[Number]** | One or more contributor codes. This is a comma-separated list. Use the &#x60;&#x60;&#x60;/meta/research-contributors&#x60;&#x60;&#x60; endpoint to get the list of permissioned contributors. If this parameter is not used, by default will get all permissioned contributors. | [optional] 
**analystId** | **[Number]** | One or more analyst codes of authors who were the primary or secondary authors of the documents. This is a comma-separated list. Use the &#x60;&#x60;&#x60;/meta/research-analysts&#x60;&#x60;&#x60; endpoint to get the list of permissioned analysts for the provided contibutor ID. If this parameter is omitted, the result set is not filtered by analyst code, and the corresponding analyst field(s) and details are not returned in the response. | [optional] 
**reportFoci** | **[String]** | One or more classification codes indicating the primary focus of the document. These codes help categorize the content based on various dimensions such as the subject entity, geographic scope, asset characteristics, and financial classification. If this parameter is omitted, the result set is not filtered by reportFoci code, and the corresponding report focus fields and details are not returned in the response. The supported types are:    - Issuer - Identifies the specific company or entity the document is about.   - SectorIndustry - Indicates the relevant economic sector and industry classification.   - Region - Denotes the broader geographic area covered.   - Country - Specifies the particular country in focus.   - AssetClass - Defines the general asset category (e.g., Equity, Fixed Income, Commodities).   - AssetType - Represents the specific type of asset within the asset class.   - SecurityType - Describes the structure or legal form of the security.   - Discipline - Indicates the analytical lens or domain.   - Index - References a benchmark index discussed or tracked in the document.   - Exchange - Points to the stock or commodity exchange relevant to the content.   - Market - Represents the broader financial market or segment involved.  | [optional] 
**securityTypes** | **[String]** | One or more codes indicating security types. A This is a comma-separated list. Use the &#x60;&#x60;&#x60;/meta/security-types&#x60;&#x60;&#x60; endpoint to get the list of available security types. If this parameter is omitted, the result set is not filtered by security type, and the corresponding security type fields and details are not returned in the response. | [optional] 
**assetTypes** | **[String]** | One or more codes indicating asset types. A This is a comma-separated list. Use the &#x60;&#x60;&#x60;/meta/asset-types&#x60;&#x60;&#x60; endpoint to get the list of available asset-types. If this parameter is omitted, the result set is not filtered by asset types, and the corresponding asset type field and details are not returned in the response. | [optional] 
**assetClasses** | **[String]** | One or more codes indicating asset classes covered in the document. The supported classifications are:    - Commodity - Includes physical goods like oil, gold, and agricultural products.   - Currency - Covers foreign exchange and currency-related instruments.   - Equity - Refers to ownership interests such as stocks or shares.   - FixedIncome - Includes debt instruments like bonds and treasury bills.      If this parameter is omitted, the result set is not filtered by asset class, and the corresponding fields and details are not returned in the response.  | [optional] 
**coverageActions** | **[String]** | One or more codes indicating coverage actions discussed in the document. The supported actions are:    - Drop - Permanent discontinuation of research coverage. No further updates or publications will be issued for the entity.      - Initiate - Formal commencement of research coverage. Typically includes an initial report and sets ongoing analytical attention.      - Resume - Reinstatement of previously suspended or dropped coverage. Research publication and updates resume for the entity.      - Suspend - Temporary halt in research coverage. No updates will be issued during this period, but coverage may be resumed later.       If this parameter is omitted, the result set is not filtered by coverage action, and the corresponding coverage action field and details are not returned in the response.  | [optional] 
**compilationIndicators** | **Boolean** | An indication of whether the document contains new material or is a compilation/summary of separately published material. If this parameter is not used, it will not return whether the record in the result has complilation indicator or not.     | [optional] 
**disciplines** | **[String]** | One or more codes indicating the disciplines reflected in the document. The supported disciplines:   - Investment - Coverage related to investment assets, individual securities, or portfolio-level analysis.   - Strategy - Coverage concerning broader investment strategies, asset allocation, and portfolio construction insights.   - Economics - Coverage involving economic analysis, including macroeconomic trends, monetary policy, inflation, GDP, and related indicators.    If this parameter is omitted, the result set is not filtered by discipline, and the corresponding discipline field and details are not returned in the response.  | [optional] 
**issuerTypes** | **[String]** | One or more codes indicating issuer types covered in the document. The supported issuer types:   - Agency - Debt issued by a government-sponsored or supported agency.   - Corporate - Securities issued by private or publicly traded corporations.    - Exchange - Instruments or debt issued via an exchange platform—typically exchange-traded notes or listed debt.   - Municipality - Bonds issued by state, local, or municipal governments.   - MutualFund - Shares issued by an open-end investment fund that pools investor assets to buy securities.   - REIT - Equity or debt securities issued by a Real Estate Investment Trust, which invests in income-generating property.   - Sovereign - Debt issued by a national government.   - SupranationalOrganizations - Debt issued by multinational agencies or international institutions.    If this parameter is omitted, the result set is not filtered by issuer types, and the corresponding issuer type field and details are not returned in the response.  | [optional] 
**periodicities** | **[String]** | One or more codes indicating the fixed time interval at which the document is published.   The supported periodicities:   - Annually - Document is published once every year.   - Daily - Document is published every day.   - EveryTwoWeeks - Document is published every two weeks (biweekly).   - Hourly - Document is published every hour.   - IntraDay - Document is published multiple times within the same day.   - Monthly - Document is published once every month.   - None - No fixed periodicity; publication is irregular or ad hoc.   - Other - Publication follows a custom or unspecified interval.   - Quarterly - Document is published once every quarter (every three months).   - SemiAnnually - Document is published twice a year.   - Weekly - Document is published once every week.    If this parameter is omitted, the result set is not filtered by periodicities, and the corresponding periodicities field and details are not returned in the response.  | [optional] 
**purposes** | **[String]** | One or more codes indicating the report purpose of the document.   The supported purposes:   - Action - Intended to drive or recommend a specific investment decision or action.   - Influence - Aimed at shaping opinions or market sentiment without directly recommending action.   - Education - Designed to inform or explain concepts, methodologies, or market mechanics.    If this parameter is omitted, the result set is not filtered by purposes, and the corresponding purposes field and details are not returned in the response.   | [optional] 
**ratingActions** | **[String]** | One or more codes indicating rating actions discussed in the document. The supported rating actions:   - Affirmed - Maintains the current rating after review.   - Downgrade - Lowers the rating to a worse category.   - Drop - Removes rating coverage entirely.   - Initiate - Applies a rating for the first time on the entity.   - NegativeOutlook - Assigns a negative outlook without changing the rating.   - NewRating - Introduces a rating where none existed before.   - PositiveOutlook - Assigns a positive outlook without changing the rating.   - RatingRestored - Reinstates a previously withdrawn or suspended rating.   - RatingWithdrawn - Removes the current rating but leaves open resumption.   - Reiterate - Reaffirms the existing rating without change.   - ReviewDirectionUncertain - Places rating under review without a clear direction.   - ReviewForDowngrade - Places rating under review, likely to be downgraded.   - ReviewForUpgrade - Places rating under review, likely to be upgraded.   - Revise - Modifies rating details or scale without changing direction.   - Upgrade - Raises the rating to a better category.        If this parameter is omitted, the result set is not filtered by rating actions, and the corresponding rating actions field and details are not returned in the response.   | [optional] 
**researchApproaches** | **[String]** | One or more codes indicating the research perspective provided in the document.   The supported research approaches:   - Fundamental - Based on analysis of financial statements, industry conditions, and management quality to determine intrinsic value.   - Quantitative - Relies on statistical models, mathematical algorithms, and historical data to identify patterns and signals.   - Technical - Focuses on price charts, trading volume, and market trends to forecast future price movements.     If this parameter is omitted, the result set is not filtered by research approaches, and the corresponding research approaches field and details are not returned in the response.     | [optional] 
**targetActions** | **[String]** | One or more codes indicating target price actions discussed in the document.   The supported target actions:   - Decrease - Lowers the previously stated target price for a security.   - Increase - Raises the previously stated target price for a security.   - Reiterate - Confirms the existing target price without change.   - Update - Modifies the target price, direction may or may not be specified.     If this parameter is omitted, the result set is not filtered by target actions, and the corresponding target actions field and details are not returned in the response.     | [optional] 
**weightingActions** | **[String]** | One or more codes indicating weighting actions discussed in the document.   The supported weighting actions:   - Decrease - Lowers the portfolio weighting or exposure to a security or sector.   - Increase - Raises the portfolio weighting or exposure to a security or sector.   - Reiterate - Maintains the current weighting recommendation without change.   - Update - Adjusts the weighting, potentially reflecting a revised strategy or allocation.     If this parameter is omitted, the result set is not filtered by weighting actions, and the corresponding weighting actions field and details are not returned in the response.   | [optional] 



## Enum: [SourcesEnum]


* `FRC` (value: `"FRC"`)

* `AMR` (value: `"AMR"`)





## Enum: [ReportFociEnum]


* `Issuer` (value: `"Issuer"`)

* `SectorIndustry` (value: `"SectorIndustry"`)

* `Region` (value: `"Region"`)

* `Country` (value: `"Country"`)

* `AssetClass` (value: `"AssetClass"`)

* `AssetType` (value: `"AssetType"`)

* `SecurityType` (value: `"SecurityType"`)

* `Discipline` (value: `"Discipline"`)

* `Index` (value: `"Index"`)

* `Exchange` (value: `"Exchange"`)

* `Market` (value: `"Market"`)





## Enum: [AssetClassesEnum]


* `Commodity` (value: `"Commodity"`)

* `Currency` (value: `"Currency"`)

* `Equity` (value: `"Equity"`)

* `FixedIncome` (value: `"FixedIncome"`)





## Enum: [CoverageActionsEnum]


* `Drop` (value: `"Drop"`)

* `Initiate` (value: `"Initiate"`)

* `Resume` (value: `"Resume"`)

* `Suspend` (value: `"Suspend"`)





## Enum: [DisciplinesEnum]


* `Investment` (value: `"Investment"`)

* `Strategy` (value: `"Strategy"`)

* `Economics` (value: `"Economics"`)





## Enum: [IssuerTypesEnum]


* `Agency` (value: `"Agency"`)

* `Corporate` (value: `"Corporate"`)

* `Exchange` (value: `"Exchange"`)

* `Municipality` (value: `"Municipality"`)

* `MutualFund` (value: `"MutualFund"`)

* `REIT` (value: `"REIT"`)

* `Sovereign` (value: `"Sovereign"`)

* `SupranationalOrganizations` (value: `"SupranationalOrganizations"`)





## Enum: [PeriodicitiesEnum]


* `Annually` (value: `"Annually"`)

* `Daily` (value: `"Daily"`)

* `EveryTwoWeeks` (value: `"EveryTwoWeeks"`)

* `Hourly` (value: `"Hourly"`)

* `IntraDay` (value: `"IntraDay"`)

* `Monthly` (value: `"Monthly"`)

* `None` (value: `"None"`)

* `Other` (value: `"Other"`)

* `Quarterly` (value: `"Quarterly"`)

* `SemiAnnually` (value: `"SemiAnnually"`)

* `Weekly` (value: `"Weekly"`)





## Enum: [PurposesEnum]


* `Action` (value: `"Action"`)

* `Influence` (value: `"Influence"`)

* `Education` (value: `"Education"`)





## Enum: [RatingActionsEnum]


* `Affirmed` (value: `"Affirmed"`)

* `Downgrade` (value: `"Downgrade"`)

* `Drop` (value: `"Drop"`)

* `Initiate` (value: `"Initiate"`)

* `NegativeOutlook` (value: `"NegativeOutlook"`)

* `NewRating` (value: `"NewRating"`)

* `PositiveOutlook` (value: `"PositiveOutlook"`)

* `RatingRestored` (value: `"RatingRestored"`)

* `RatingWithdrawn` (value: `"RatingWithdrawn"`)

* `Reiterate` (value: `"Reiterate"`)

* `ReviewDirectionUncertain` (value: `"ReviewDirectionUncertain"`)

* `ReviewForDowngrade` (value: `"ReviewForDowngrade"`)

* `ReviewForUpgrade` (value: `"ReviewForUpgrade"`)

* `Revise` (value: `"Revise"`)

* `Upgrade` (value: `"Upgrade"`)





## Enum: [ResearchApproachesEnum]


* `Fundamental` (value: `"Fundamental"`)

* `Quantitative` (value: `"Quantitative"`)

* `Technical` (value: `"Technical"`)





## Enum: [TargetActionsEnum]


* `Decrease` (value: `"Decrease"`)

* `Increase` (value: `"Increase"`)

* `Reiterate` (value: `"Reiterate"`)

* `Update` (value: `"Update"`)





## Enum: [WeightingActionsEnum]


* `Decrease` (value: `"Decrease"`)

* `Increase` (value: `"Increase"`)

* `Reiterate` (value: `"Reiterate"`)

* `Update` (value: `"Update"`)




