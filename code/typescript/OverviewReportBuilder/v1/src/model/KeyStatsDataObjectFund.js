/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import KeyStatsDataObjectFundAumFundMonth from './KeyStatsDataObjectFundAumFundMonth';
import KeyStatsDataObjectFundAumShareDaily from './KeyStatsDataObjectFundAumShareDaily';
import KeyStatsDataObjectFundAvailableForSale from './KeyStatsDataObjectFundAvailableForSale';
import KeyStatsDataObjectFundAverageSpread from './KeyStatsDataObjectFundAverageSpread';
import KeyStatsDataObjectFundCurrencyIso from './KeyStatsDataObjectFundCurrencyIso';
import KeyStatsDataObjectFundDailyTradingVol from './KeyStatsDataObjectFundDailyTradingVol';
import KeyStatsDataObjectFundDistributionYield from './KeyStatsDataObjectFundDistributionYield';
import KeyStatsDataObjectFundEsgCompliance from './KeyStatsDataObjectFundEsgCompliance';
import KeyStatsDataObjectFundEsgObjective from './KeyStatsDataObjectFundEsgObjective';
import KeyStatsDataObjectFundExpenseRatio from './KeyStatsDataObjectFundExpenseRatio';
import KeyStatsDataObjectFundFirstNavRecord from './KeyStatsDataObjectFundFirstNavRecord';
import KeyStatsDataObjectFundFundFlowYTD from './KeyStatsDataObjectFundFundFlowYTD';
import KeyStatsDataObjectFundInceptionDateFund from './KeyStatsDataObjectFundInceptionDateFund';
import KeyStatsDataObjectFundInceptionDateShare from './KeyStatsDataObjectFundInceptionDateShare';
import KeyStatsDataObjectFundMeta from './KeyStatsDataObjectFundMeta';
import KeyStatsDataObjectFundOutstandingShare from './KeyStatsDataObjectFundOutstandingShare';
import KeyStatsDataObjectFundSfdrClassification from './KeyStatsDataObjectFundSfdrClassification';

/**
 * The KeyStatsDataObjectFund model module.
 * @module model/KeyStatsDataObjectFund
 */
class KeyStatsDataObjectFund {
    /**
     * Constructs a new <code>KeyStatsDataObjectFund</code>.
     * Key Statistics for the provided fund
     * @alias module:model/KeyStatsDataObjectFund
     */
    constructor() { 
        
        KeyStatsDataObjectFund.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>KeyStatsDataObjectFund</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectFund} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectFund} The populated <code>KeyStatsDataObjectFund</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectFund();

            if (data.hasOwnProperty('aumFundMonth')) {
                obj['aumFundMonth'] = KeyStatsDataObjectFundAumFundMonth.constructFromObject(data['aumFundMonth']);
            }
            if (data.hasOwnProperty('aumShareDaily')) {
                obj['aumShareDaily'] = KeyStatsDataObjectFundAumShareDaily.constructFromObject(data['aumShareDaily']);
            }
            if (data.hasOwnProperty('availableForSale')) {
                obj['availableForSale'] = KeyStatsDataObjectFundAvailableForSale.constructFromObject(data['availableForSale']);
            }
            if (data.hasOwnProperty('averageSpread')) {
                obj['averageSpread'] = KeyStatsDataObjectFundAverageSpread.constructFromObject(data['averageSpread']);
            }
            if (data.hasOwnProperty('currencyIso')) {
                obj['currencyIso'] = KeyStatsDataObjectFundCurrencyIso.constructFromObject(data['currencyIso']);
            }
            if (data.hasOwnProperty('dailyTradingVol')) {
                obj['dailyTradingVol'] = KeyStatsDataObjectFundDailyTradingVol.constructFromObject(data['dailyTradingVol']);
            }
            if (data.hasOwnProperty('distributionYield')) {
                obj['distributionYield'] = KeyStatsDataObjectFundDistributionYield.constructFromObject(data['distributionYield']);
            }
            if (data.hasOwnProperty('esgCompliance')) {
                obj['esgCompliance'] = KeyStatsDataObjectFundEsgCompliance.constructFromObject(data['esgCompliance']);
            }
            if (data.hasOwnProperty('esgObjective')) {
                obj['esgObjective'] = KeyStatsDataObjectFundEsgObjective.constructFromObject(data['esgObjective']);
            }
            if (data.hasOwnProperty('expenseRatio')) {
                obj['expenseRatio'] = KeyStatsDataObjectFundExpenseRatio.constructFromObject(data['expenseRatio']);
            }
            if (data.hasOwnProperty('firstNavRecord')) {
                obj['firstNavRecord'] = KeyStatsDataObjectFundFirstNavRecord.constructFromObject(data['firstNavRecord']);
            }
            if (data.hasOwnProperty('fundFlowYTD')) {
                obj['fundFlowYTD'] = KeyStatsDataObjectFundFundFlowYTD.constructFromObject(data['fundFlowYTD']);
            }
            if (data.hasOwnProperty('inceptionDateFund')) {
                obj['inceptionDateFund'] = KeyStatsDataObjectFundInceptionDateFund.constructFromObject(data['inceptionDateFund']);
            }
            if (data.hasOwnProperty('inceptionDateShare')) {
                obj['inceptionDateShare'] = KeyStatsDataObjectFundInceptionDateShare.constructFromObject(data['inceptionDateShare']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = KeyStatsDataObjectFundMeta.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('outstandingShare')) {
                obj['outstandingShare'] = KeyStatsDataObjectFundOutstandingShare.constructFromObject(data['outstandingShare']);
            }
            if (data.hasOwnProperty('sfdrClassification')) {
                obj['sfdrClassification'] = KeyStatsDataObjectFundSfdrClassification.constructFromObject(data['sfdrClassification']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsDataObjectFundAumFundMonth} aumFundMonth
 */
KeyStatsDataObjectFund.prototype['aumFundMonth'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundAumShareDaily} aumShareDaily
 */
KeyStatsDataObjectFund.prototype['aumShareDaily'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundAvailableForSale} availableForSale
 */
KeyStatsDataObjectFund.prototype['availableForSale'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundAverageSpread} averageSpread
 */
KeyStatsDataObjectFund.prototype['averageSpread'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundCurrencyIso} currencyIso
 */
KeyStatsDataObjectFund.prototype['currencyIso'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundDailyTradingVol} dailyTradingVol
 */
KeyStatsDataObjectFund.prototype['dailyTradingVol'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundDistributionYield} distributionYield
 */
KeyStatsDataObjectFund.prototype['distributionYield'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundEsgCompliance} esgCompliance
 */
KeyStatsDataObjectFund.prototype['esgCompliance'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundEsgObjective} esgObjective
 */
KeyStatsDataObjectFund.prototype['esgObjective'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundExpenseRatio} expenseRatio
 */
KeyStatsDataObjectFund.prototype['expenseRatio'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundFirstNavRecord} firstNavRecord
 */
KeyStatsDataObjectFund.prototype['firstNavRecord'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundFundFlowYTD} fundFlowYTD
 */
KeyStatsDataObjectFund.prototype['fundFlowYTD'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundInceptionDateFund} inceptionDateFund
 */
KeyStatsDataObjectFund.prototype['inceptionDateFund'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundInceptionDateShare} inceptionDateShare
 */
KeyStatsDataObjectFund.prototype['inceptionDateShare'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundMeta} meta
 */
KeyStatsDataObjectFund.prototype['meta'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundOutstandingShare} outstandingShare
 */
KeyStatsDataObjectFund.prototype['outstandingShare'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectFundSfdrClassification} sfdrClassification
 */
KeyStatsDataObjectFund.prototype['sfdrClassification'] = undefined;






export default KeyStatsDataObjectFund;

