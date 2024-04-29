

# Detail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealId** | **String** | FactSet unique deal Identifier. |  [optional]
**target** | [**Target**](Target.md) |  |  [optional]
**buyers** | [**java.util.List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are buyers. |  [optional]
**sellers** | [**java.util.List&lt;Participant&gt;**](Participant.md) | Array of participants in the deal who are sellers. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the deal. |  [optional]
**rumorDate** | **LocalDate** | For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement. |  [optional]
**announceDate** | **LocalDate** | Date the deal was announced. |  [optional]
**referenceDate** | **LocalDate** | In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target&#39;s share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet&#39;s Coffee &amp; Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02. |  [optional]
**expectedCloseDate** | **LocalDate** | Expected close date of the deal. |  [optional]
**closeDate** | **LocalDate** | Date the deal was closed. |  [optional]
**cancelDate** | **LocalDate** | Date the deal was cancelled. |  [optional]
**dealType** | [**DealTypeEnum**](#DealTypeEnum) | Type of deal. |  [optional]
**sourceFunds** | [**java.util.List&lt;SourceFundsEnum&gt;**](#java.util.List&lt;SourceFundsEnum&gt;) | Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper. |  [optional]
**dealValue** | [**DealValue**](DealValue.md) |  |  [optional]
**purpose** | [**PurposeEnum**](#PurposeEnum) | Transaction purpose code or description. |  [optional]
**evSales** | **BigDecimal** | Ratio: Enterprise value/sales. |  [optional]
**evEBIT** | **BigDecimal** | Ratio: Enterprise value/EBIT. |  [optional]
**evEBITDA** | **BigDecimal** | Ratio: Enterprise value/EBITDA. |  [optional]
**bepBV** | **BigDecimal** | Ratio: BEP/BV. |  [optional]
**sales** | **BigDecimal** | Sales at the time of the deal in USD. |  [optional]
**ebit** | **BigDecimal** | EBIT at the time of the deal in USD. |  [optional]
**ebitda** | **BigDecimal** | EBITDA at the time of the deal in USD. |  [optional]
**netIncome** | **BigDecimal** | Net income at the time of the deal in USD. |  [optional]
**cash** | **BigDecimal** | Cash at the time of the deal in USD. |  [optional]
**intBearingDebt** | **BigDecimal** | Interest bearing debt at the time of the deal in USD. |  [optional]
**prefStockValue** | **BigDecimal** | Preferred stock value at the time of the deal in USD. |  [optional]
**totalAssets** | **BigDecimal** | Total assets at the time of the deal in USD. |  [optional]
**sharesOutstanding** | **BigDecimal** | Shares outstanding at the time of the deal. |  [optional]
**eps** | **BigDecimal** | Earnings per share at the time of the deal in USD. |  [optional]
**bookValueShare** | **BigDecimal** | Book value per share at the time of the deal in USD. |  [optional]
**targetPostMergerOwn** | **BigDecimal** | Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. |  [optional]
**buyerPostMergerOwn** | **BigDecimal** | Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. |  [optional]
**attitude** | [**AttitudeEnum**](#AttitudeEnum) | The way the target&#39;s board of directors viewed the acquirer&#39;s proposal to enter into the transaction - Friendly, Hostile, Neutral. |  [optional]
**dealSummary** | **String** | Summary of the deal. |  [optional]
**dealCharacteristics** | [**java.util.List&lt;DealCharacteristicsEnum&gt;**](#java.util.List&lt;DealCharacteristicsEnum&gt;) | The secondary deal type(s). |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;Pending&quot;
COMPLETE | &quot;Complete&quot;
CANCELLED | &quot;Cancelled&quot;
RUMOR | &quot;Rumor&quot;
RUMOR_CANCELLED | &quot;Rumor Cancelled&quot;



## Enum: DealTypeEnum

Name | Value
---- | -----
ACQUISITION_MERGER | &quot;Acquisition / Merger&quot;
MAJORITY_STAKE | &quot;Majority Stake&quot;
MINORITY_STAKE | &quot;Minority Stake&quot;
SPINOFF | &quot;Spinoff&quot;



## Enum: java.util.List&lt;SourceFundsEnum&gt;

Name | Value
---- | -----
BANK_LOAN | &quot;Bank Loan&quot;
BOND_NOTE_ISSUANCE | &quot;Bond/Note Issuance&quot;
INTERNALLY_GENERATED_FUNDS | &quot;Internally Generated Funds&quot;
MEZZANINE | &quot;Mezzanine&quot;
PRIVATE_COMPANY_DEBT | &quot;Private Company Debt&quot;
PRIVATE_EQUITY_VENTURE_FUNDING | &quot;Private Equity/Venture Funding&quot;
PRIVATE_WARRANT_OPTION | &quot;Private Warrant Option&quot;
SOURCE_OF_FUNDING_NOT_DISCLOSED | &quot;Source of Funding Not Disclosed&quot;
STOCK_ISSUANCE_PREF_COM_PUBLIC_ | &quot;Stock Issuance: Pref &amp; Com (Public)&quot;



## Enum: PurposeEnum

Name | Value
---- | -----
FINANCIAL | &quot;Financial&quot;
STRATEGIC | &quot;Strategic&quot;



## Enum: AttitudeEnum

Name | Value
---- | -----
FRIENDLY | &quot;Friendly&quot;
HOSTILE | &quot;Hostile&quot;
NEUTRAL | &quot;Neutral&quot;



## Enum: java.util.List&lt;DealCharacteristicsEnum&gt;

Name | Value
---- | -----
DIVESTMENT | &quot;Divestment&quot;
EMPLOYEE_BUY_OUT | &quot;Employee Buy-Out&quot;
EXIT | &quot;Exit&quot;
INVESTOR_BUY_IN | &quot;Investor Buy-In&quot;
INVESTOR_BUY_OUT | &quot;Investor Buy-Out&quot;
INSOLVENCY | &quot;Insolvency&quot;
MANAGEMENT_BUY_OUT | &quot;Management Buy-Out&quot;
REVERSE_TAKEOVER | &quot;Reverse Takeover&quot;
SECONDARY_BUY_OUT | &quot;Secondary Buy-Out&quot;
LEVERAGED_BUY_OUT | &quot;Leveraged Buy-Out&quot;
GOING_PRIVATE | &quot;Going Private&quot;
EXIT_PARTIAL_ | &quot;Exit (Partial)&quot;
CONTROL_PREMIUM_STUDY | &quot;Control Premium Study&quot;
PRIVATE_EQUITY_GROUP | &quot;Private Equity Group&quot;
ASSET_PURCHASE | &quot;Asset Purchase&quot;
RELATED_PARTY | &quot;Related Party&quot;
TENDER_OFFER | &quot;Tender Offer&quot;
UNEQUAL_VOTING | &quot;Unequal Voting&quot;
TARGET_CONTROLLING_SHAREHOLDER | &quot;Target Controlling Shareholder&quot;
AUCTION | &quot;Auction&quot;
CLUB_DEAL_PE_GROUP | &quot;Club Deal - PE Group&quot;
CLUB_DEAL_CORP_PE | &quot;Club Deal - Corp/PE&quot;
VENTURE_BACKED_ACQUIRER | &quot;Venture Backed Acquirer&quot;
UNSOLICITED_BID | &quot;Unsolicited Bid&quot;
RUMOR | &quot;Rumor&quot;
SCHEME_OF_ARRANGEMENT | &quot;Scheme of Arrangement&quot;
GOLDEN_SHARE | &quot;Golden Share&quot;
MERGER_OF_EQUALS | &quot;Merger of Equals&quot;
PRIVATIZATION | &quot;Privatization&quot;
INDICATIVE_TENTATIVE_PROPOSAL | &quot;Indicative / Tentative Proposal&quot;
CLUB_DEAL_CORPORATE_GROUP | &quot;Club Deal - Corporate Group&quot;
MULTIPLE_TARGET_DEAL | &quot;Multiple Target Deal&quot;
SPAC | &quot;SPAC&quot;
SQUEEZE_OUT | &quot;Squeeze Out&quot;
SPECIAL_COMMITTEE | &quot;Special Committee&quot;
COLLAR | &quot;Collar&quot;
FORCED_REGULATORY_DIVESTITURE | &quot;Forced Regulatory Divestiture&quot;
VENTURE_BACKED_TARGET | &quot;Venture-Backed Target&quot;
BANK_BRANCH_PURCHASE | &quot;Bank Branch Purchase&quot;
BIDDER_SPECIAL_COMMITTEE | &quot;Bidder Special Committee&quot;
TARGET_SPECIAL_COMMITTEE | &quot;Target Special Committee&quot;
BIDDER_CONTROLLING_SHAREHOLDER | &quot;Bidder Controlling Shareholder&quot;
PROPERTY_TRANSACTION | &quot;Property Transaction&quot;
POWER_PLANT_PURCHASE | &quot;Power Plant Purchase&quot;


## Implemented Interfaces

* Serializable


