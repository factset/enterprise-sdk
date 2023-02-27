/**
 * Stocks API For Digital Portals
 * The Stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years. Search criteria also include benchmark-related attributes (beta, correlation, outperformance), and ESG parameters, based on FactSet’s Truvalue ESG scores.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with daily updates).  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) and the [Securitized Derivatives API](https://developer.factset.com/api-catalog/securitized-derivatives-api-digital-portals) for details.  See also the recipe [\"Enrich Your Digital Portal with Flexible Equity Screening\"](https://developer.factset.com/recipe-catalog/enrich-your-digital-portal-flexible-equity-screening). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse2001DataIncomeStatementClaimLossExpense from './InlineResponse2001DataIncomeStatementClaimLossExpense';
import InlineResponse2001DataIncomeStatementEbit from './InlineResponse2001DataIncomeStatementEbit';
import InlineResponse2001DataIncomeStatementEbitda from './InlineResponse2001DataIncomeStatementEbitda';
import InlineResponse2001DataIncomeStatementGrossIncome from './InlineResponse2001DataIncomeStatementGrossIncome';
import InlineResponse2001DataIncomeStatementInterestExpense from './InlineResponse2001DataIncomeStatementInterestExpense';
import InlineResponse2001DataIncomeStatementInterestIncome from './InlineResponse2001DataIncomeStatementInterestIncome';
import InlineResponse2001DataIncomeStatementLoanLossProvision from './InlineResponse2001DataIncomeStatementLoanLossProvision';
import InlineResponse2001DataIncomeStatementLongTermInsuranceReserves from './InlineResponse2001DataIncomeStatementLongTermInsuranceReserves';
import InlineResponse2001DataIncomeStatementNetIncome from './InlineResponse2001DataIncomeStatementNetIncome';
import InlineResponse2001DataIncomeStatementNetInterestIncome from './InlineResponse2001DataIncomeStatementNetInterestIncome';
import InlineResponse2001DataIncomeStatementOperatingExpense from './InlineResponse2001DataIncomeStatementOperatingExpense';
import InlineResponse2001DataIncomeStatementOperatingIncome from './InlineResponse2001DataIncomeStatementOperatingIncome';
import InlineResponse2001DataIncomeStatementSales from './InlineResponse2001DataIncomeStatementSales';

/**
 * The InlineResponse2001DataIncomeStatement model module.
 * @module model/InlineResponse2001DataIncomeStatement
 */
class InlineResponse2001DataIncomeStatement {
    /**
     * Constructs a new <code>InlineResponse2001DataIncomeStatement</code>.
     * Income statement data.
     * @alias module:model/InlineResponse2001DataIncomeStatement
     */
    constructor() { 
        
        InlineResponse2001DataIncomeStatement.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2001DataIncomeStatement</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001DataIncomeStatement} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001DataIncomeStatement} The populated <code>InlineResponse2001DataIncomeStatement</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001DataIncomeStatement();

            if (data.hasOwnProperty('sales')) {
                obj['sales'] = InlineResponse2001DataIncomeStatementSales.constructFromObject(data['sales']);
            }
            if (data.hasOwnProperty('grossIncome')) {
                obj['grossIncome'] = InlineResponse2001DataIncomeStatementGrossIncome.constructFromObject(data['grossIncome']);
            }
            if (data.hasOwnProperty('ebit')) {
                obj['ebit'] = InlineResponse2001DataIncomeStatementEbit.constructFromObject(data['ebit']);
            }
            if (data.hasOwnProperty('ebitda')) {
                obj['ebitda'] = InlineResponse2001DataIncomeStatementEbitda.constructFromObject(data['ebitda']);
            }
            if (data.hasOwnProperty('interestIncome')) {
                obj['interestIncome'] = InlineResponse2001DataIncomeStatementInterestIncome.constructFromObject(data['interestIncome']);
            }
            if (data.hasOwnProperty('interestExpense')) {
                obj['interestExpense'] = InlineResponse2001DataIncomeStatementInterestExpense.constructFromObject(data['interestExpense']);
            }
            if (data.hasOwnProperty('loanLossProvision')) {
                obj['loanLossProvision'] = InlineResponse2001DataIncomeStatementLoanLossProvision.constructFromObject(data['loanLossProvision']);
            }
            if (data.hasOwnProperty('netInterestIncome')) {
                obj['netInterestIncome'] = InlineResponse2001DataIncomeStatementNetInterestIncome.constructFromObject(data['netInterestIncome']);
            }
            if (data.hasOwnProperty('netIncome')) {
                obj['netIncome'] = InlineResponse2001DataIncomeStatementNetIncome.constructFromObject(data['netIncome']);
            }
            if (data.hasOwnProperty('operatingIncome')) {
                obj['operatingIncome'] = InlineResponse2001DataIncomeStatementOperatingIncome.constructFromObject(data['operatingIncome']);
            }
            if (data.hasOwnProperty('operatingExpense')) {
                obj['operatingExpense'] = InlineResponse2001DataIncomeStatementOperatingExpense.constructFromObject(data['operatingExpense']);
            }
            if (data.hasOwnProperty('claimLossExpense')) {
                obj['claimLossExpense'] = InlineResponse2001DataIncomeStatementClaimLossExpense.constructFromObject(data['claimLossExpense']);
            }
            if (data.hasOwnProperty('longTermInsuranceReserves')) {
                obj['longTermInsuranceReserves'] = InlineResponse2001DataIncomeStatementLongTermInsuranceReserves.constructFromObject(data['longTermInsuranceReserves']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementSales} sales
 */
InlineResponse2001DataIncomeStatement.prototype['sales'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementGrossIncome} grossIncome
 */
InlineResponse2001DataIncomeStatement.prototype['grossIncome'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementEbit} ebit
 */
InlineResponse2001DataIncomeStatement.prototype['ebit'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementEbitda} ebitda
 */
InlineResponse2001DataIncomeStatement.prototype['ebitda'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementInterestIncome} interestIncome
 */
InlineResponse2001DataIncomeStatement.prototype['interestIncome'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementInterestExpense} interestExpense
 */
InlineResponse2001DataIncomeStatement.prototype['interestExpense'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementLoanLossProvision} loanLossProvision
 */
InlineResponse2001DataIncomeStatement.prototype['loanLossProvision'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementNetInterestIncome} netInterestIncome
 */
InlineResponse2001DataIncomeStatement.prototype['netInterestIncome'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementNetIncome} netIncome
 */
InlineResponse2001DataIncomeStatement.prototype['netIncome'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementOperatingIncome} operatingIncome
 */
InlineResponse2001DataIncomeStatement.prototype['operatingIncome'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementOperatingExpense} operatingExpense
 */
InlineResponse2001DataIncomeStatement.prototype['operatingExpense'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementClaimLossExpense} claimLossExpense
 */
InlineResponse2001DataIncomeStatement.prototype['claimLossExpense'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataIncomeStatementLongTermInsuranceReserves} longTermInsuranceReserves
 */
InlineResponse2001DataIncomeStatement.prototype['longTermInsuranceReserves'] = undefined;






export default InlineResponse2001DataIncomeStatement;
