

# RegulationsTaxDetailsAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**taxItemsType** | **RegulationsTaxDetailsType** |  | 
**regulatoryAuthority** | **String** | The regulatory authority supervising the fund or umbrella. Data is returned for Mutual Funds only. Possible values include—     SEC, CONSOB, FCMC, CSSF, MFSA, AFM, NFSA, ASF, CNMV, FINMA, FCA, FRC, JFSC, FI (SE),   FIN-FSA, GFSC, FMA (LI), NBS, FME, MNB, CMB, FMA (AT), FMA (AU), SFSA, HANFA, EFSA,   ATVP, CNB, CMB, CMVM, KNF, CIMA, CCAF, FSMA, COVIP, IOMFSA, FI (EE), DFSA, AMF,   BaFin, HCMC, CBI  |  [optional]
**ucitsScheme** | **String** | Determines whether the fund is regulated under the UCITS IV (Directive 2009/65/EC) or UCITS V (Directive 2014/91/EU). Data is returned for Mutual Funds only. |  [optional]
**ucitsCompliance** | **Boolean** | Determines whether the fund is regulated under the UCITS IV (Directive 2009/65/EC) or UCITS V (Directive 2014/91/EU). Data is returned for Mutual Funds only. |  [optional]
**priipsEligible** | **Boolean** | Indicates if the fund has a published Key Information Document (KID) in the fund website. Data is returned for Mutual Funds only. |  [optional]
**taxReportingStatusUK** | **Boolean** | UK Tax Reporting indicates if a fund has UK fund tax status which enables approved shares to provide favorable tax rates on any gain upon disposal of investor&#39;s investments. Data is returned for both Mutual Funds and ETFs. |  [optional]
**srdComplianceFR** | **Boolean** | Returns &#39;True&#39; if the fund is eligible for Deferred Settlement Service or Service à Réglement Différé (SRD) in France. Data is returned for Mutual Funds only. |  [optional]
**isaUKCompliant** | **Boolean** | UK ISA Compliance indicates whether the fund is included in the UK ISA (Individual Savings Account) in-house tax free saving scheme. Data is returned for both Mutual Funds and ETFs |  [optional]
**peaEligibleFr** | **Boolean** | Returns &#39;True&#39; if the fund is eligible for the Plan d&#39;Epargne en Action (PEA) or “shared savings plan” in France.It is a regulated savings product that allows the purchase of European equities or funds without capitalization constraints.Data is returned for Mutual Funds only. |  [optional]
**navFrequency** | [**NavFrequencyEnum**](#NavFrequencyEnum) | Returns frequency at which the NAV is calculated. Data is returned for Mutual Funds only. |  [optional]
**transactionCutOffTime** | **String** | Returns the cut off time for transactions. The value is provided as a time string in the format \&quot;HH:mm z\&quot;,  where HH:mm is the hour and minute, and z is the timezone abbreviation (e.g., \&quot;12:00 GMT\&quot;).  |  [optional]
**esgObjective** | **Boolean** | Determine if the fund is ESG compliant or not and returns the fund&#39;s ESG classification. |  [optional]
**sfdrClassification** | **String** | Determines if the fund is ESG compliant and returns the fund&#39;s ESG classification according to the Sustainable Finance Disclosure Regulation (SFDR). Possible values:   - Article 8: Preferences for products having ESG Characteristics.   - Article 9: Preferences for products having Sustainable Objectives.   - Article 6: Fund is not ESG but makes disclosures on the integration of sustainable risks.   - Article 0: The type or structure of the fund is out of ESG requirements.   - NA:- No information available. Data is returned for both Mutual Funds and ETFs.  |  [optional]
**ukSDR** | **String** | Returns the fund&#39;s UK SDR. Data is returned for both Mutual Funds and ETFs |  [optional]
**availableForSaleIn** | **java.util.List&lt;String&gt;** | Returns where the fund is available for sale. Data is returned for both Mutual Funds and ETFs. Each entry is an ISO 3166-1 alpha-2 country code. |  [optional]



## Enum: NavFrequencyEnum

Name | Value
---- | -----
DAILY | &quot;Daily&quot;
BI_MONTHLY | &quot;Bi-Monthly&quot;
SEMI_MONTHLY | &quot;Semi-Monthly&quot;
BI_WEEKLY | &quot;Bi-Weekly&quot;
TRI_ANNUALLY | &quot;Tri-Annually&quot;
WEEKLY | &quot;Weekly&quot;
SEMI_WEEKLY | &quot;Semi-Weekly&quot;
MONTHLY | &quot;Monthly&quot;
QUARTERLY | &quot;Quarterly&quot;
SEMI_ANNUAL | &quot;Semi-annual&quot;
ANNUALLY | &quot;Annually&quot;
ERRATIC | &quot;Erratic&quot;
NONE | &quot;None&quot;


## Implemented Interfaces

* Serializable


