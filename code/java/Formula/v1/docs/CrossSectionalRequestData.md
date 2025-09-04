

# CrossSectionalRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Array of entity identifiers.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  |  [optional]
**symbolType** | **String** | Specify the type of symbols submitted in the &#x60;ids&#x60; parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the &#x60;fsymId&#x60; parameter in addition to the &#x60;symbolType&#x60; parameter.   * Bloomberg symbols can not be submitted with other symbol types.     Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.  |  [optional]
**universe** | **String** | Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  |  [optional]
**universeType** | [**UniverseTypeEnum**](#UniverseTypeEnum) | Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type -   * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)    * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)    * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  |  [optional]
**universeExclusion** | [**java.util.List&lt;UniverseExclusionEnum&gt;**](#java.util.List&lt;UniverseExclusionEnum&gt;) | Specify the security types you would like to exclude from your *EQUITY* &#x60;universe&#x60; expression. The supported exclusion values are &#x60;INACTIVE&#x60;, &#x60;SECONDARY&#x60;, and &#x60;NONEQUITY&#x60;. You can specify more than one exclusion criteria within a request. For GET requests, each exclusion should be separated by a comma and for POST requests, they should be supplied in an array. More information about each exclusion can be found below:   * Exclude Inactive Securities (&#x60;INACTIVE&#x60;): Omits securities that have ceased trading due to circumstances such as bankruptcy and M&amp;A activity  * Exclude Secondary Listings (&#x60;SECONDARY&#x60;): Omits securities linked to a primarily listing (e.g., ADRs, GDRs)  * Exclude Non-Equity Securities (&#x60;NONEQUITY&#x60;): Omits securities including indices, market statistics, mutual funds, and exchange-traded funds (ETFs); preferred stock is excluded on a case-by-case basis  Find more documentation on Universe Exclusion logic on [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606) under &#39;Understanding Criteria Options&#39;.  This parameter may only be used in conjunction with the &#x60;universe&#x60; parameter and the &#x60;universeType&#x60; set to EQUITY. Using this parameter with a &#x60;universeType&#x60; other than EQUITY will result in error.  |  [optional]
**formulas** | **java.util.List&lt;String&gt;** | Array of Screening formulas | 
**backTestDate** | **String** | Specify the backtest date either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  To learn more about backtesting, please visit [Online Assistant Page 20610](https://my.apps.factset.com/oa/pages/20610#backtest). User must have access to backtesting functionality.  |  [optional]
**calendar** | **String** | Calendar of data returned. |  [optional]
**fsymId** | [**FsymIdEnum**](#FsymIdEnum) | Specify **Y** for &#x60;fsymId&#x60; to return an additional response object for the data item fsymId which will contain the fsymIds of the requestIds, in addition to the response object containing the data item requestId. The default value for &#x60;fsymId&#x60; is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security&#39;s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  |  [optional]
**displayName** | **java.util.List&lt;String&gt;** | Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  |  [optional]
**flatten** | [**FlattenEnum**](#FlattenEnum) | Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Cross-Sectional Result Object Flattened** schema for more detail on the response structure for flattened output.  |  [optional]
**batch** | [**BatchEnum**](#BatchEnum) | Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to 30 minutes. Upon requesting \&quot;batch\&quot;: \&quot;Y\&quot;, the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  |  [optional]
**startDate** | **String** | Specify the start date for running the Iterated Cross Sectional Functionality request either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  |  [optional]
**endDate** | **String** | Specify the end date for running the Iterated Cross Sectional Functionality request either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  |  [optional]
**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Specify the frequency for running the Iterated Cross Sectional Functionality request. The following frequencies are supported **D**, **W**, **M**, **AM**, **CQ**, **AY**, or **CY**.  To learn more about frequency, please visit [Online Assistant Page 1964](https://my.apps.factset.com/oa/pages/1964#frequency). User must have access to backtesting functionality.  |  [optional]



## Enum: UniverseTypeEnum

Name | Value
---- | -----
EQUITY | &quot;EQUITY&quot;
DEBT | &quot;DEBT&quot;
FUND | &quot;FUND&quot;



## Enum: java.util.List&lt;UniverseExclusionEnum&gt;

Name | Value
---- | -----
INACTIVE | &quot;INACTIVE&quot;
SECONDARY | &quot;SECONDARY&quot;
NONEQUITY | &quot;NONEQUITY&quot;



## Enum: FsymIdEnum

Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;



## Enum: FlattenEnum

Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;



## Enum: BatchEnum

Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;



## Enum: FrequencyEnum

Name | Value
---- | -----
D | &quot;D&quot;
W | &quot;W&quot;
M | &quot;M&quot;
AM | &quot;AM&quot;
CQ | &quot;CQ&quot;
AY | &quot;AY&quot;
CY | &quot;CY&quot;


## Implemented Interfaces

* Serializable


