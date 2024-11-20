# Detail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deal_id** | **str** | FactSet unique deal Identifier. | [optional] 
**target** | [**Target**](Target.md) |  | [optional] 
**buyers** | [**[Participant]**](Participant.md) | Array of participants in the deal who are buyers. | [optional] 
**sellers** | [**[Participant], none_type**](Participant.md) | Array of participants in the deal who are sellers. | [optional] 
**status** | **str** | Status of the deal. | [optional] 
**rumor_date** | **date, none_type** | For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement. | [optional] 
**announce_date** | **date, none_type** | Date the deal was announced. | [optional] 
**reference_date** | **date, none_type** | In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target&#39;s share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet&#39;s Coffee &amp; Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02. | [optional] 
**expected_close_date** | **date, none_type** | Expected close date of the deal. | [optional] 
**close_date** | **date, none_type** | Date the deal was closed. | [optional] 
**cancel_date** | **date, none_type** | Date the deal was cancelled. | [optional] 
**deal_type** | **str** | Type of deal. | [optional] 
**source_funds** | **[str, none_type], none_type** | Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper. | [optional] 
**deal_value** | [**DealValue**](DealValue.md) |  | [optional] 
**purpose** | **str, none_type** | Transaction purpose code or description. | [optional] 
**ev_sales** | **float, none_type** | Ratio: Enterprise value/sales. | [optional] 
**ev_ebit** | **float, none_type** | Ratio: Enterprise value/EBIT. | [optional] 
**ev_ebitda** | **float, none_type** | Ratio: Enterprise value/EBITDA. | [optional] 
**bep_bv** | **float, none_type** | Ratio: BEP/BV. | [optional] 
**sales** | **float, none_type** | Sales at the time of the deal in USD. | [optional] 
**ebit** | **float, none_type** | EBIT at the time of the deal in USD. | [optional] 
**ebitda** | **float, none_type** | EBITDA at the time of the deal in USD. | [optional] 
**net_income** | **float, none_type** | Net income at the time of the deal in USD. | [optional] 
**cash** | **float, none_type** | Cash at the time of the deal in USD. | [optional] 
**int_bearing_debt** | **float, none_type** | Interest bearing debt at the time of the deal in USD. | [optional] 
**pref_stock_value** | **float, none_type** | Preferred stock value at the time of the deal in USD. | [optional] 
**total_assets** | **float, none_type** | Total assets at the time of the deal in USD. | [optional] 
**shares_outstanding** | **float, none_type** | Shares outstanding at the time of the deal. | [optional] 
**eps** | **float, none_type** | Earnings per share at the time of the deal in USD. | [optional] 
**book_value_share** | **float, none_type** | Book value per share at the time of the deal in USD. | [optional] 
**target_post_merger_own** | **float, none_type** | Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. | [optional] 
**buyer_post_merger_own** | **float, none_type** | Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded. | [optional] 
**attitude** | **str, none_type** | The way the target&#39;s board of directors viewed the acquirer&#39;s proposal to enter into the transaction - Friendly, Hostile, Neutral. | [optional] 
**deal_summary** | **str, none_type** | Summary of the deal. | [optional] 
**deal_characteristics** | **[str, none_type], none_type** | The secondary deal type(s). Possible values include: - Divestment - Employee Buy-Out - Exit - Investor Buy-In - Investor Buy-Out - Insolvency - Management Buy-Out - Reverse Takeover - Secondary Buy-Out - Leveraged Buy-Out - Going Private - Exit (Partial) - Control Premium Study - Private Equity Group - Asset Purchase - Related Party - Tender Offer - Unequal Voting - Target Controlling Shareholder - Auction - Club Deal - PE Group - Club Deal - Corp/PE - Venture Backed Acquirer - Unsolicited Bid - Rumor - Scheme of Arrangement - Golden Share - Merger of Equals - Privatization - Indicative / Tentative Proposal - Club Deal - Corporate Group - Multiple Target Deal - SPAC - Squeeze Out - Special Committee - Collar - Forced Regulatory Divestiture - Venture-Backed Target - Bank Branch Purchase - Bidder Special Committee - Target Special Committee - Bidder Controlling Shareholder - Property Transaction - Power Plant Purchase - PE-Backed Target  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


