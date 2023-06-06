# fds.sdk.FactSetQuantFactorLibrary.HelperApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_factor_library**](HelperApi.md#get_factor_library) | **GET** /factset-quant-factor-library/v1/library | Retrieve a list of all available factors with relevant meta data.
[**get_factor_library_list**](HelperApi.md#get_factor_library_list) | **POST** /factset-quant-factor-library/v1/library | Retrieves a list of all available factors with relevant meta data.



# **get_factor_library**
> LibraryResponse get_factor_library()

Retrieve a list of all available factors with relevant meta data.

Fetch the list of all available factors and related meta data. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetQuantFactorLibrary
from fds.sdk.FactSetQuantFactorLibrary.api import helper_api
from fds.sdk.FactSetQuantFactorLibrary.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetQuantFactorLibrary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetQuantFactorLibrary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetQuantFactorLibrary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = helper_api.HelperApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    factors = ["rsi21D","ulcer252D","turbulence21D"] # [str] | Array of individual Factor Items requested for the library endpoint. Use the factorGroups parameter to pull for a full list of factors based off the input group.   (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    factor_groups = ["Momentum","Technical","Volatility"] # [str] | Fetch a collection of Factors that fall within one of the below \"groups\". For example, resting factorGroup=Momentum will return all factors under the momentum group. To know which items are available in each group use the /library endpoint.***<p>factor groups limit** = 5 factor groups per request* ### Classification and Reference |Group|Descriptions| |---|---| |Asset_Data|Easily input security-level metadata into your quantitative research process. Common metrics used include Days Since Report, Days to Report, ADR Flag, and Minimum Lot Size. Integrate variables from FactSet Reference, FactSet Fundamentals, and FactSet Estimates databases to impose portfolio constraints and access general reference data.| |Country|Evaluate securities based on the countries in which they have the highest exposure. Analyze company-level exposures across various countries and measure how concentrated a firm’s business is within their countries of operation. Metrics are derived from FactSet Reference and FactSet Geographic Revenue Exposure (GeoRev) databases and include Country Exposure, Country of Incorporation, and Country of Risk.| |Industry|Classify securities based on the industries in which they generate the majority of their revenues. Incorporate variables from the FactSet Revere Business and Industry Classification System (RBICS) database to measure how concentrated a firm’s business is within the industries they operate and across various sub-sectors. Common metrics include Industry Classifications, Industry Exposures, and Industry Concentration.| |Size|Assess how large or small a company is relative to industry peers. Create size buckets and clarify the systematic portion of company returns using variables from FactSet Prices, FactSet RBICS, FactSet Fundamentals, and FactSet Estimates. Common metrics include Size Classification, Enterprise Value, and Market Share.| ### Market Factors |Group|Descriptions| |---|---| |Liquidity|Assess how investible a security is, as well as the potential market impact of a trade using signals built off pricing and volume data from FactSet Prices. Integrate factors as components into your alpha models to evaluate systematic risk or input them into your portfolio construction models to dictate how much of an asset can be bought or sold based on liquidity levels. Common metrics include Average Dollars Traded, Share Turnover, and Bid Ask Spread.| |Market Sensitivity|Clarify the common variations in stock returns attributable to the performance of their local market indices. Leverage regressions performed between security-level and market-index returns across different return horizons and methodologies. Metrics are derived from FactSet Prices and include Beta R-Squared, Up Market Beta, and Down Market Beta.| |Momentum|Analyze the historical momentum of a security and uncover how each underlying data item, calculation, and horizon can be meaningful in different situations. Metrics are derived from FactSet Prices and include 52W Position, Return Momentum, and Velocity.| |Technical|Forecast the direction of future price movements based on historical market data and leverage heuristic or pattern-based signals from FactSet Prices. Common metrics include Average True Range, Ulcer Performance Index, and Money Flow Volume.| |Volatility|Measure the uncertainty in asset price movements with indicators from the FactSet Prices database. Capture various forms of uncertainty by employing statistical calculations on security performance data. Common metrics include Return Volatility, Semivariance, and Turbulence.| ### Core Fundamentals |Group|Descriptions| |---|---| |Efficiency|Leverage core financial data to determine how effectively a company uses its assets, collects payments, and operates its business. Most variables are measured as turnover ratios and include changes over time to provide transparency into the efficiency of each business process. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Asset Turnover, Receivables Turnover, and Cash Conversion Cycle| |Growth|Measure a company’s ability to grow faster than its peers. Compare the future expected growth of a company with its historical growth and view growth rates adjusted for stability. Integrate variables from FactSet RBICS, FactSet Fundamentals, and FactSet Estimates to analyze growth rates over multiple horizons including Market Share, Sales, and EPS Growth| |Management|Gain insight into how management finances their business and the decisions they make that impact the core financial statements. These choices are reflected in changes to total debt or equity, the overall size of the balance sheet, and decisions around the accounting methods used. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Capital Expenditures (CAPEX) Growth, Equity Buyback Ratio, and Depreciation & Amortization Variability| |Profitability|Evaluate a company’s ability to generate income relative to its revenue or balance sheet metrics. Identify lucrative businesses relative to their industry, region, and size profile. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Return on Assets, Return on Invested Capital Change, and Return on Total Equity |Quality|Understand the overall financial health and quality of a company’s business. Use historical data from FactSet Fundamentals to analyze balance sheet health, stability of earnings and profit margins, variability in cash flows, and trends that look beyond headline financial metrics. Common metrics include Cash Earnings Ratio Variability, Revenue Stability, and Accruals Ratios. Composite quality scores (i.e., the Piotroski F-Score, Beneish M-Score, and Altman Z-Score) and their underlying components are also available as individual metrics.| |Solvency|Measure a company’s ability to meet their short- and long-term financial obligations and determine the degree of leverage employed to run their business. Incorporate financial ratios from FactSet Fundamentals and FactSet Estimates to quantify liability or debt obligation relative to earnings, cash flows, equities, or items from the asset side of the balance sheet. Common metrics include Current Ratio, Current Asset Liquidity, and Debt to Equity Change.| |Value|Quickly determine how cheap or expensive a company is based on common security-level characteristics from FactSet Prices, FactSet Fundamentals, and FactSet Estimates. Apply factors as an intersection between other factors for a more customized analysis, such as finding the cheapest stocks among the highest quality companies. Common metrics include Earnings Yield, Book to Price, and Revenue to Enterprise Value.| ### Macro and Cross-Asset |Group|Descriptions| |---|---| |Commodity|Quantify the impact movements in the commodity markets have on equity prices. Metrics are derived from FactSet Prices and allow you to measure company-level exposure to commodities such as Gold, Crude Oil, Coffee, and Live Cattle.| |FX_Sensitivity| Analyze security-level sensitivity to fluctuations in the currency markets. Metrics are derived from FactSet Prices and allow you to identify company exposures to currencies such as USD, EUR, JPY, and CNY. |Debt|Uncover details related to company debt through issuer-level factor exposures. Use the FactSet Fixed Income Prices & Derived Analytics database to aggregate metrics at the company level. Common metrics include Effective Duration, Option Adjusted Spread, and Yield to Worst.| |Economic|Capture daily security exposures to leading economic indicator forecasts. Leverage the Quant Factor Library’s detailed country exposure model to attribute economic measures to individual companies. Metrics are derived from FactSet Economic Estimates and include Real GPD Growth, Industrial Production Growth, Core CPI Inflation, and Policy Rates. ### Alternative |Group|Descriptions| |---|---| |Analyst_Sentiment|Analyze a security’s outlook from the perspective of a sell-side research analyst. Leverage consensus estimates data from the FactSet Estimates database to analyze the directional change in estimate revisions for various financial statement items and time periods. Common metrics include Sales Estimate Revisions, Free Cash Flow Estimate Revisions, and Robust Estimate Revisions.| |Corporate_Governance|Identify companies with strong corporate governance. Analyze the profile of a company’s management and board based on tenure, diversity, compensation incentives, and more factors from the FactSet People database. Common metrics include Management - Average Age, Board - Activist Member, and Executives - Average Bonus.| |Crowding|Understand the degree to which investors own, purchase, or sell a security. View characteristics of each investor’s profile and characterize crowding from passive, active, institutional, ETF, and hedge fund investors. Use metrics from FactSet Ownership, FactSet Prices, and FactSet Fundamentals to help identify potential effects of crowding such as whether certain investor types are acquiring or divesting from a given security. Common metrics include Active Buyer Percent of Portfolio Change, ETF Days to Liquidate, and Hedge Fund Percent Outstanding.| |Insider_Activity|Measure the degree to which insiders own, purchase, or sell their company’s stock. Analyze the sentiment of those with access to material non-public information or determine how the amount of insider ownership may impact management’s key business decisions. Metrics are derived from FactSet Ownership and include Insider Percent Outstanding, Insider Number of Buys, and Insider Seller Position Change. |ESG|Analyze Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores to uncover risks and opportunities from companies. Truvalue Labs focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.  (optional)

    try:
        # Retrieve a list of all available factors with relevant meta data.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_factor_library(factors=factors, factor_groups=factor_groups)

        pprint(api_response)

    except fds.sdk.FactSetQuantFactorLibrary.ApiException as e:
        print("Exception when calling HelperApi->get_factor_library: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **factors** | **[str]**| Array of individual Factor Items requested for the library endpoint. Use the factorGroups parameter to pull for a full list of factors based off the input group.   | [optional]
 **factor_groups** | **[str]**| Fetch a collection of Factors that fall within one of the below \&quot;groups\&quot;. For example, resting factorGroup&#x3D;Momentum will return all factors under the momentum group. To know which items are available in each group use the /library endpoint.***&lt;p&gt;factor groups limit** &#x3D; 5 factor groups per request* ### Classification and Reference |Group|Descriptions| |---|---| |Asset_Data|Easily input security-level metadata into your quantitative research process. Common metrics used include Days Since Report, Days to Report, ADR Flag, and Minimum Lot Size. Integrate variables from FactSet Reference, FactSet Fundamentals, and FactSet Estimates databases to impose portfolio constraints and access general reference data.| |Country|Evaluate securities based on the countries in which they have the highest exposure. Analyze company-level exposures across various countries and measure how concentrated a firm’s business is within their countries of operation. Metrics are derived from FactSet Reference and FactSet Geographic Revenue Exposure (GeoRev) databases and include Country Exposure, Country of Incorporation, and Country of Risk.| |Industry|Classify securities based on the industries in which they generate the majority of their revenues. Incorporate variables from the FactSet Revere Business and Industry Classification System (RBICS) database to measure how concentrated a firm’s business is within the industries they operate and across various sub-sectors. Common metrics include Industry Classifications, Industry Exposures, and Industry Concentration.| |Size|Assess how large or small a company is relative to industry peers. Create size buckets and clarify the systematic portion of company returns using variables from FactSet Prices, FactSet RBICS, FactSet Fundamentals, and FactSet Estimates. Common metrics include Size Classification, Enterprise Value, and Market Share.| ### Market Factors |Group|Descriptions| |---|---| |Liquidity|Assess how investible a security is, as well as the potential market impact of a trade using signals built off pricing and volume data from FactSet Prices. Integrate factors as components into your alpha models to evaluate systematic risk or input them into your portfolio construction models to dictate how much of an asset can be bought or sold based on liquidity levels. Common metrics include Average Dollars Traded, Share Turnover, and Bid Ask Spread.| |Market Sensitivity|Clarify the common variations in stock returns attributable to the performance of their local market indices. Leverage regressions performed between security-level and market-index returns across different return horizons and methodologies. Metrics are derived from FactSet Prices and include Beta R-Squared, Up Market Beta, and Down Market Beta.| |Momentum|Analyze the historical momentum of a security and uncover how each underlying data item, calculation, and horizon can be meaningful in different situations. Metrics are derived from FactSet Prices and include 52W Position, Return Momentum, and Velocity.| |Technical|Forecast the direction of future price movements based on historical market data and leverage heuristic or pattern-based signals from FactSet Prices. Common metrics include Average True Range, Ulcer Performance Index, and Money Flow Volume.| |Volatility|Measure the uncertainty in asset price movements with indicators from the FactSet Prices database. Capture various forms of uncertainty by employing statistical calculations on security performance data. Common metrics include Return Volatility, Semivariance, and Turbulence.| ### Core Fundamentals |Group|Descriptions| |---|---| |Efficiency|Leverage core financial data to determine how effectively a company uses its assets, collects payments, and operates its business. Most variables are measured as turnover ratios and include changes over time to provide transparency into the efficiency of each business process. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Asset Turnover, Receivables Turnover, and Cash Conversion Cycle| |Growth|Measure a company’s ability to grow faster than its peers. Compare the future expected growth of a company with its historical growth and view growth rates adjusted for stability. Integrate variables from FactSet RBICS, FactSet Fundamentals, and FactSet Estimates to analyze growth rates over multiple horizons including Market Share, Sales, and EPS Growth| |Management|Gain insight into how management finances their business and the decisions they make that impact the core financial statements. These choices are reflected in changes to total debt or equity, the overall size of the balance sheet, and decisions around the accounting methods used. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Capital Expenditures (CAPEX) Growth, Equity Buyback Ratio, and Depreciation &amp; Amortization Variability| |Profitability|Evaluate a company’s ability to generate income relative to its revenue or balance sheet metrics. Identify lucrative businesses relative to their industry, region, and size profile. Metrics are derived from FactSet Fundamentals and FactSet Estimates and include Return on Assets, Return on Invested Capital Change, and Return on Total Equity |Quality|Understand the overall financial health and quality of a company’s business. Use historical data from FactSet Fundamentals to analyze balance sheet health, stability of earnings and profit margins, variability in cash flows, and trends that look beyond headline financial metrics. Common metrics include Cash Earnings Ratio Variability, Revenue Stability, and Accruals Ratios. Composite quality scores (i.e., the Piotroski F-Score, Beneish M-Score, and Altman Z-Score) and their underlying components are also available as individual metrics.| |Solvency|Measure a company’s ability to meet their short- and long-term financial obligations and determine the degree of leverage employed to run their business. Incorporate financial ratios from FactSet Fundamentals and FactSet Estimates to quantify liability or debt obligation relative to earnings, cash flows, equities, or items from the asset side of the balance sheet. Common metrics include Current Ratio, Current Asset Liquidity, and Debt to Equity Change.| |Value|Quickly determine how cheap or expensive a company is based on common security-level characteristics from FactSet Prices, FactSet Fundamentals, and FactSet Estimates. Apply factors as an intersection between other factors for a more customized analysis, such as finding the cheapest stocks among the highest quality companies. Common metrics include Earnings Yield, Book to Price, and Revenue to Enterprise Value.| ### Macro and Cross-Asset |Group|Descriptions| |---|---| |Commodity|Quantify the impact movements in the commodity markets have on equity prices. Metrics are derived from FactSet Prices and allow you to measure company-level exposure to commodities such as Gold, Crude Oil, Coffee, and Live Cattle.| |FX_Sensitivity| Analyze security-level sensitivity to fluctuations in the currency markets. Metrics are derived from FactSet Prices and allow you to identify company exposures to currencies such as USD, EUR, JPY, and CNY. |Debt|Uncover details related to company debt through issuer-level factor exposures. Use the FactSet Fixed Income Prices &amp; Derived Analytics database to aggregate metrics at the company level. Common metrics include Effective Duration, Option Adjusted Spread, and Yield to Worst.| |Economic|Capture daily security exposures to leading economic indicator forecasts. Leverage the Quant Factor Library’s detailed country exposure model to attribute economic measures to individual companies. Metrics are derived from FactSet Economic Estimates and include Real GPD Growth, Industrial Production Growth, Core CPI Inflation, and Policy Rates. ### Alternative |Group|Descriptions| |---|---| |Analyst_Sentiment|Analyze a security’s outlook from the perspective of a sell-side research analyst. Leverage consensus estimates data from the FactSet Estimates database to analyze the directional change in estimate revisions for various financial statement items and time periods. Common metrics include Sales Estimate Revisions, Free Cash Flow Estimate Revisions, and Robust Estimate Revisions.| |Corporate_Governance|Identify companies with strong corporate governance. Analyze the profile of a company’s management and board based on tenure, diversity, compensation incentives, and more factors from the FactSet People database. Common metrics include Management - Average Age, Board - Activist Member, and Executives - Average Bonus.| |Crowding|Understand the degree to which investors own, purchase, or sell a security. View characteristics of each investor’s profile and characterize crowding from passive, active, institutional, ETF, and hedge fund investors. Use metrics from FactSet Ownership, FactSet Prices, and FactSet Fundamentals to help identify potential effects of crowding such as whether certain investor types are acquiring or divesting from a given security. Common metrics include Active Buyer Percent of Portfolio Change, ETF Days to Liquidate, and Hedge Fund Percent Outstanding.| |Insider_Activity|Measure the degree to which insiders own, purchase, or sell their company’s stock. Analyze the sentiment of those with access to material non-public information or determine how the amount of insider ownership may impact management’s key business decisions. Metrics are derived from FactSet Ownership and include Insider Percent Outstanding, Insider Number of Buys, and Insider Seller Position Change. |ESG|Analyze Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores to uncover risks and opportunities from companies. Truvalue Labs focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.  | [optional]

### Return type

[**LibraryResponse**](LibraryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Available Factors and Related Meta Data |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_factor_library_list**
> LibraryResponse get_factor_library_list(library_request)

Retrieves a list of all available factors with relevant meta data.

Fetch the list of all available factors and related meta data. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetQuantFactorLibrary
from fds.sdk.FactSetQuantFactorLibrary.api import helper_api
from fds.sdk.FactSetQuantFactorLibrary.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetQuantFactorLibrary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetQuantFactorLibrary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetQuantFactorLibrary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = helper_api.HelperApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    library_request = LibraryRequest(
        factors=FactorsParam(["rsi21D","ulcer252D"]),
        factor_groups=FactorGroupsParam(["Momentum","Technical"]),
    ) # LibraryRequest | Available Factors and Related Meta Data.

    try:
        # Retrieves a list of all available factors with relevant meta data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_factor_library_list(library_request)

        pprint(api_response)

    except fds.sdk.FactSetQuantFactorLibrary.ApiException as e:
        print("Exception when calling HelperApi->get_factor_library_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **library_request** | [**LibraryRequest**](LibraryRequest.md)| Available Factors and Related Meta Data. |

### Return type

[**LibraryResponse**](LibraryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Library Response Object |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

