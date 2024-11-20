/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import MultiDayBenchmarks from './MultiDayBenchmarks';

/**
 * The Order model module.
 * @module model/Order
 */
class Order {
    /**
     * Constructs a new <code>Order</code>.
     * Order object
     * @alias module:model/Order
     */
    constructor() { 
        
        Order.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Order</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Order} obj Optional instance to populate.
     * @return {module:model/Order} The populated <code>Order</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Order();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('basketId')) {
                obj['basketId'] = ApiClient.convertToType(data['basketId'], 'String');
            }
            if (data.hasOwnProperty('parentId')) {
                obj['parentId'] = ApiClient.convertToType(data['parentId'], 'String');
            }
            if (data.hasOwnProperty('grandParentId')) {
                obj['grandParentId'] = ApiClient.convertToType(data['grandParentId'], 'String');
            }
            if (data.hasOwnProperty('orderId')) {
                obj['orderId'] = ApiClient.convertToType(data['orderId'], 'String');
            }
            if (data.hasOwnProperty('masterOrderId')) {
                obj['masterOrderId'] = ApiClient.convertToType(data['masterOrderId'], 'String');
            }
            if (data.hasOwnProperty('compositeId')) {
                obj['compositeId'] = ApiClient.convertToType(data['compositeId'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('securityId')) {
                obj['securityId'] = ApiClient.convertToType(data['securityId'], 'String');
            }
            if (data.hasOwnProperty('companyName')) {
                obj['companyName'] = ApiClient.convertToType(data['companyName'], 'String');
            }
            if (data.hasOwnProperty('side')) {
                obj['side'] = ApiClient.convertToType(data['side'], 'String');
            }
            if (data.hasOwnProperty('synthetic')) {
                obj['synthetic'] = ApiClient.convertToType(data['synthetic'], 'Boolean');
            }
            if (data.hasOwnProperty('orderVolume')) {
                obj['orderVolume'] = ApiClient.convertToType(data['orderVolume'], 'Number');
            }
            if (data.hasOwnProperty('volume')) {
                obj['volume'] = ApiClient.convertToType(data['volume'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('limitPrice')) {
                obj['limitPrice'] = ApiClient.convertToType(data['limitPrice'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('openPrice')) {
                obj['openPrice'] = ApiClient.convertToType(data['openPrice'], 'Number');
            }
            if (data.hasOwnProperty('closePrice')) {
                obj['closePrice'] = ApiClient.convertToType(data['closePrice'], 'Number');
            }
            if (data.hasOwnProperty('refValue')) {
                obj['refValue'] = ApiClient.convertToType(data['refValue'], 'Number');
            }
            if (data.hasOwnProperty('vwapFfClose')) {
                obj['vwapFfClose'] = ApiClient.convertToType(data['vwapFfClose'], 'Number');
            }
            if (data.hasOwnProperty('vwapOpenClose')) {
                obj['vwapOpenClose'] = ApiClient.convertToType(data['vwapOpenClose'], 'Number');
            }
            if (data.hasOwnProperty('firstFillMid')) {
                obj['firstFillMid'] = ApiClient.convertToType(data['firstFillMid'], 'Number');
            }
            if (data.hasOwnProperty('firstFillMidPerfBps')) {
                obj['firstFillMidPerfBps'] = ApiClient.convertToType(data['firstFillMidPerfBps'], 'Number');
            }
            if (data.hasOwnProperty('openPerfBps')) {
                obj['openPerfBps'] = ApiClient.convertToType(data['openPerfBps'], 'Number');
            }
            if (data.hasOwnProperty('lastFillMid')) {
                obj['lastFillMid'] = ApiClient.convertToType(data['lastFillMid'], 'Number');
            }
            if (data.hasOwnProperty('lastFillMidPerfBps')) {
                obj['lastFillMidPerfBps'] = ApiClient.convertToType(data['lastFillMidPerfBps'], 'Number');
            }
            if (data.hasOwnProperty('reversion5MinMidPrice')) {
                obj['reversion5MinMidPrice'] = ApiClient.convertToType(data['reversion5MinMidPrice'], 'Number');
            }
            if (data.hasOwnProperty('reversion5MinMidBps')) {
                obj['reversion5MinMidBps'] = ApiClient.convertToType(data['reversion5MinMidBps'], 'Number');
            }
            if (data.hasOwnProperty('reversion10MinMidPrice')) {
                obj['reversion10MinMidPrice'] = ApiClient.convertToType(data['reversion10MinMidPrice'], 'Number');
            }
            if (data.hasOwnProperty('reversion10MinMidBps')) {
                obj['reversion10MinMidBps'] = ApiClient.convertToType(data['reversion10MinMidBps'], 'Number');
            }
            if (data.hasOwnProperty('reversion15MinMidPrice')) {
                obj['reversion15MinMidPrice'] = ApiClient.convertToType(data['reversion15MinMidPrice'], 'Number');
            }
            if (data.hasOwnProperty('reversion15MinMidBps')) {
                obj['reversion15MinMidBps'] = ApiClient.convertToType(data['reversion15MinMidBps'], 'Number');
            }
            if (data.hasOwnProperty('reversion60MinMidPrice')) {
                obj['reversion60MinMidPrice'] = ApiClient.convertToType(data['reversion60MinMidPrice'], 'Number');
            }
            if (data.hasOwnProperty('reversion60MinMidBps')) {
                obj['reversion60MinMidBps'] = ApiClient.convertToType(data['reversion60MinMidBps'], 'Number');
            }
            if (data.hasOwnProperty('intraOrderVolatility')) {
                obj['intraOrderVolatility'] = ApiClient.convertToType(data['intraOrderVolatility'], 'Number');
            }
            if (data.hasOwnProperty('vwapFfLf')) {
                obj['vwapFfLf'] = ApiClient.convertToType(data['vwapFfLf'], 'Number');
            }
            if (data.hasOwnProperty('vwapFfLfPerfBps')) {
                obj['vwapFfLfPerfBps'] = ApiClient.convertToType(data['vwapFfLfPerfBps'], 'Number');
            }
            if (data.hasOwnProperty('closePerfBps')) {
                obj['closePerfBps'] = ApiClient.convertToType(data['closePerfBps'], 'Number');
            }
            if (data.hasOwnProperty('durationBinMin')) {
                obj['durationBinMin'] = ApiClient.convertToType(data['durationBinMin'], 'Number');
            }
            if (data.hasOwnProperty('durationBinSec')) {
                obj['durationBinSec'] = ApiClient.convertToType(data['durationBinSec'], 'Number');
            }
            if (data.hasOwnProperty('participationRatePct')) {
                obj['participationRatePct'] = ApiClient.convertToType(data['participationRatePct'], 'Number');
            }
            if (data.hasOwnProperty('spreadCross')) {
                obj['spreadCross'] = ApiClient.convertToType(data['spreadCross'], 'Number');
            }
            if (data.hasOwnProperty('duration')) {
                obj['duration'] = ApiClient.convertToType(data['duration'], 'Number');
            }
            if (data.hasOwnProperty('pwp20Price')) {
                obj['pwp20Price'] = ApiClient.convertToType(data['pwp20Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp20Volume')) {
                obj['pwp20Volume'] = ApiClient.convertToType(data['pwp20Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp20PerfBps')) {
                obj['pwp20PerfBps'] = ApiClient.convertToType(data['pwp20PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('pwp10Price')) {
                obj['pwp10Price'] = ApiClient.convertToType(data['pwp10Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp10Volume')) {
                obj['pwp10Volume'] = ApiClient.convertToType(data['pwp10Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp10PerfBps')) {
                obj['pwp10PerfBps'] = ApiClient.convertToType(data['pwp10PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('pwp05Price')) {
                obj['pwp05Price'] = ApiClient.convertToType(data['pwp05Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp05Volume')) {
                obj['pwp05Volume'] = ApiClient.convertToType(data['pwp05Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp05PerfBps')) {
                obj['pwp05PerfBps'] = ApiClient.convertToType(data['pwp05PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('pwp01Price')) {
                obj['pwp01Price'] = ApiClient.convertToType(data['pwp01Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp01Volume')) {
                obj['pwp01Volume'] = ApiClient.convertToType(data['pwp01Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp01PerfBps')) {
                obj['pwp01PerfBps'] = ApiClient.convertToType(data['pwp01PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('pwp02Price')) {
                obj['pwp02Price'] = ApiClient.convertToType(data['pwp02Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp02Volume')) {
                obj['pwp02Volume'] = ApiClient.convertToType(data['pwp02Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp02PerfBps')) {
                obj['pwp02PerfBps'] = ApiClient.convertToType(data['pwp02PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('pwp03Price')) {
                obj['pwp03Price'] = ApiClient.convertToType(data['pwp03Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp03Volume')) {
                obj['pwp03Volume'] = ApiClient.convertToType(data['pwp03Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp03PerfBps')) {
                obj['pwp03PerfBps'] = ApiClient.convertToType(data['pwp03PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('pwp50Price')) {
                obj['pwp50Price'] = ApiClient.convertToType(data['pwp50Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp50Volume')) {
                obj['pwp50Volume'] = ApiClient.convertToType(data['pwp50Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp50PerfBps')) {
                obj['pwp50PerfBps'] = ApiClient.convertToType(data['pwp50PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('pwp100Price')) {
                obj['pwp100Price'] = ApiClient.convertToType(data['pwp100Price'], 'Number');
            }
            if (data.hasOwnProperty('pwp100Volume')) {
                obj['pwp100Volume'] = ApiClient.convertToType(data['pwp100Volume'], 'Number');
            }
            if (data.hasOwnProperty('pwp100PerfBps')) {
                obj['pwp100PerfBps'] = ApiClient.convertToType(data['pwp100PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('marketAdjustment')) {
                obj['marketAdjustment'] = ApiClient.convertToType(data['marketAdjustment'], 'Number');
            }
            if (data.hasOwnProperty('intraOrderVolatilityBps')) {
                obj['intraOrderVolatilityBps'] = ApiClient.convertToType(data['intraOrderVolatilityBps'], 'Number');
            }
            if (data.hasOwnProperty('refCurrency')) {
                obj['refCurrency'] = ApiClient.convertToType(data['refCurrency'], 'String');
            }
            if (data.hasOwnProperty('vwapFfLfVolume')) {
                obj['vwapFfLfVolume'] = ApiClient.convertToType(data['vwapFfLfVolume'], 'Number');
            }
            if (data.hasOwnProperty('limitVwapFfLfVolume')) {
                obj['limitVwapFfLfVolume'] = ApiClient.convertToType(data['limitVwapFfLfVolume'], 'Number');
            }
            if (data.hasOwnProperty('limitVwapFfLf')) {
                obj['limitVwapFfLf'] = ApiClient.convertToType(data['limitVwapFfLf'], 'Number');
            }
            if (data.hasOwnProperty('limitVwapFfLfPerfBps')) {
                obj['limitVwapFfLfPerfBps'] = ApiClient.convertToType(data['limitVwapFfLfPerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitParticipationRatePct')) {
                obj['limitParticipationRatePct'] = ApiClient.convertToType(data['limitParticipationRatePct'], 'Number');
            }
            if (data.hasOwnProperty('marketSpreadCross')) {
                obj['marketSpreadCross'] = ApiClient.convertToType(data['marketSpreadCross'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp20Price')) {
                obj['limitPwp20Price'] = ApiClient.convertToType(data['limitPwp20Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp20Volume')) {
                obj['limitPwp20Volume'] = ApiClient.convertToType(data['limitPwp20Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp20PerfBps')) {
                obj['limitPwp20PerfBps'] = ApiClient.convertToType(data['limitPwp20PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp10Price')) {
                obj['limitPwp10Price'] = ApiClient.convertToType(data['limitPwp10Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp10Volume')) {
                obj['limitPwp10Volume'] = ApiClient.convertToType(data['limitPwp10Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp10PerfBps')) {
                obj['limitPwp10PerfBps'] = ApiClient.convertToType(data['limitPwp10PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp05Price')) {
                obj['limitPwp05Price'] = ApiClient.convertToType(data['limitPwp05Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp05Volume')) {
                obj['limitPwp05Volume'] = ApiClient.convertToType(data['limitPwp05Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp05PerfBps')) {
                obj['limitPwp05PerfBps'] = ApiClient.convertToType(data['limitPwp05PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp01Price')) {
                obj['limitPwp01Price'] = ApiClient.convertToType(data['limitPwp01Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp01Volume')) {
                obj['limitPwp01Volume'] = ApiClient.convertToType(data['limitPwp01Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp01PerfBps')) {
                obj['limitPwp01PerfBps'] = ApiClient.convertToType(data['limitPwp01PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp02Price')) {
                obj['limitPwp02Price'] = ApiClient.convertToType(data['limitPwp02Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp02Volume')) {
                obj['limitPwp02Volume'] = ApiClient.convertToType(data['limitPwp02Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp02PerfBps')) {
                obj['limitPwp02PerfBps'] = ApiClient.convertToType(data['limitPwp02PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp03Price')) {
                obj['limitPwp03Price'] = ApiClient.convertToType(data['limitPwp03Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp03Volume')) {
                obj['limitPwp03Volume'] = ApiClient.convertToType(data['limitPwp03Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp03PerfBps')) {
                obj['limitPwp03PerfBps'] = ApiClient.convertToType(data['limitPwp03PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp50Price')) {
                obj['limitPwp50Price'] = ApiClient.convertToType(data['limitPwp50Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp50Volume')) {
                obj['limitPwp50Volume'] = ApiClient.convertToType(data['limitPwp50Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp50PerfBps')) {
                obj['limitPwp50PerfBps'] = ApiClient.convertToType(data['limitPwp50PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp100Price')) {
                obj['limitPwp100Price'] = ApiClient.convertToType(data['limitPwp100Price'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp100Volume')) {
                obj['limitPwp100Volume'] = ApiClient.convertToType(data['limitPwp100Volume'], 'Number');
            }
            if (data.hasOwnProperty('limitPwp100PerfBps')) {
                obj['limitPwp100PerfBps'] = ApiClient.convertToType(data['limitPwp100PerfBps'], 'Number');
            }
            if (data.hasOwnProperty('fxRate')) {
                obj['fxRate'] = ApiClient.convertToType(data['fxRate'], 'Number');
            }
            if (data.hasOwnProperty('twas')) {
                obj['twas'] = ApiClient.convertToType(data['twas'], 'Number');
            }
            if (data.hasOwnProperty('twasAskSize')) {
                obj['twasAskSize'] = ApiClient.convertToType(data['twasAskSize'], 'Number');
            }
            if (data.hasOwnProperty('twasBidSize')) {
                obj['twasBidSize'] = ApiClient.convertToType(data['twasBidSize'], 'Number');
            }
            if (data.hasOwnProperty('timeZoneName')) {
                obj['timeZoneName'] = ApiClient.convertToType(data['timeZoneName'], 'String');
            }
            if (data.hasOwnProperty('timeZone')) {
                obj['timeZone'] = ApiClient.convertToType(data['timeZone'], 'String');
            }
            if (data.hasOwnProperty('region')) {
                obj['region'] = ApiClient.convertToType(data['region'], 'String');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
            if (data.hasOwnProperty('dateId')) {
                obj['dateId'] = ApiClient.convertToType(data['dateId'], 'String');
            }
            if (data.hasOwnProperty('parentCreationTimeUtc')) {
                obj['parentCreationTimeUtc'] = ApiClient.convertToType(data['parentCreationTimeUtc'], 'String');
            }
            if (data.hasOwnProperty('orderEntryTimeUtc')) {
                obj['orderEntryTimeUtc'] = ApiClient.convertToType(data['orderEntryTimeUtc'], 'String');
            }
            if (data.hasOwnProperty('firstFillTime')) {
                obj['firstFillTime'] = ApiClient.convertToType(data['firstFillTime'], 'String');
            }
            if (data.hasOwnProperty('firstFillTimeUtc')) {
                obj['firstFillTimeUtc'] = ApiClient.convertToType(data['firstFillTimeUtc'], 'String');
            }
            if (data.hasOwnProperty('lastFillTime')) {
                obj['lastFillTime'] = ApiClient.convertToType(data['lastFillTime'], 'String');
            }
            if (data.hasOwnProperty('lastFillTimeUtc')) {
                obj['lastFillTimeUtc'] = ApiClient.convertToType(data['lastFillTimeUtc'], 'String');
            }
            if (data.hasOwnProperty('fillTimeUtc')) {
                obj['fillTimeUtc'] = ApiClient.convertToType(data['fillTimeUtc'], 'String');
            }
            if (data.hasOwnProperty('strategy')) {
                obj['strategy'] = ApiClient.convertToType(data['strategy'], 'String');
            }
            if (data.hasOwnProperty('venue')) {
                obj['venue'] = ApiClient.convertToType(data['venue'], 'String');
            }
            if (data.hasOwnProperty('broker')) {
                obj['broker'] = ApiClient.convertToType(data['broker'], 'String');
            }
            if (data.hasOwnProperty('algo')) {
                obj['algo'] = ApiClient.convertToType(data['algo'], 'String');
            }
            if (data.hasOwnProperty('trader')) {
                obj['trader'] = ApiClient.convertToType(data['trader'], 'String');
            }
            if (data.hasOwnProperty('note')) {
                obj['note'] = ApiClient.convertToType(data['note'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('errorCodes')) {
                obj['errorCodes'] = ApiClient.convertToType(data['errorCodes'], 'String');
            }
            if (data.hasOwnProperty('processedTime')) {
                obj['processedTime'] = ApiClient.convertToType(data['processedTime'], 'String');
            }
            if (data.hasOwnProperty('clientId')) {
                obj['clientId'] = ApiClient.convertToType(data['clientId'], 'String');
            }
            if (data.hasOwnProperty('destination')) {
                obj['destination'] = ApiClient.convertToType(data['destination'], 'String');
            }
            if (data.hasOwnProperty('destinationType')) {
                obj['destinationType'] = ApiClient.convertToType(data['destinationType'], 'String');
            }
            if (data.hasOwnProperty('orderType')) {
                obj['orderType'] = ApiClient.convertToType(data['orderType'], 'String');
            }
            if (data.hasOwnProperty('messageType')) {
                obj['messageType'] = ApiClient.convertToType(data['messageType'], 'String');
            }
            if (data.hasOwnProperty('relatedOrderId')) {
                obj['relatedOrderId'] = ApiClient.convertToType(data['relatedOrderId'], ['String']);
            }
            if (data.hasOwnProperty('children')) {
                obj['children'] = ApiClient.convertToType(data['children'], [Order]);
            }
            if (data.hasOwnProperty('multiDayBenchmarks')) {
                obj['multiDayBenchmarks'] = MultiDayBenchmarks.constructFromObject(data['multiDayBenchmarks']);
            }
        }
        return obj;
    }


}

/**
 * Unique identifier for the Order
 * @member {Number} id
 */
Order.prototype['id'] = undefined;

/**
 * Order Basket Id
 * @member {String} basketId
 */
Order.prototype['basketId'] = undefined;

/**
 * Order Parent Id
 * @member {String} parentId
 */
Order.prototype['parentId'] = undefined;

/**
 * Order Grand Parent Id
 * @member {String} grandParentId
 */
Order.prototype['grandParentId'] = undefined;

/**
 * Order Id
 * @member {String} orderId
 */
Order.prototype['orderId'] = undefined;

/**
 * Master Order Id
 * @member {String} masterOrderId
 */
Order.prototype['masterOrderId'] = undefined;

/**
 * Composite Id
 * @member {String} compositeId
 */
Order.prototype['compositeId'] = undefined;

/**
 * Order Symbol
 * @member {String} symbol
 */
Order.prototype['symbol'] = undefined;

/**
 * Order ISIN
 * @member {String} isin
 */
Order.prototype['isin'] = undefined;

/**
 * Order Security Id
 * @member {String} securityId
 */
Order.prototype['securityId'] = undefined;

/**
 * Company Name
 * @member {String} companyName
 */
Order.prototype['companyName'] = undefined;

/**
 * Side of the order
 * @member {String} side
 */
Order.prototype['side'] = undefined;

/**
 * Order Synthetic flag
 * @member {Boolean} synthetic
 */
Order.prototype['synthetic'] = undefined;

/**
 * Order Volume
 * @member {Number} orderVolume
 */
Order.prototype['orderVolume'] = undefined;

/**
 * Volume
 * @member {Number} volume
 */
Order.prototype['volume'] = undefined;

/**
 * Order Price
 * @member {Number} price
 */
Order.prototype['price'] = undefined;

/**
 * Order Limit Price
 * @member {Number} limitPrice
 */
Order.prototype['limitPrice'] = undefined;

/**
 * Order Currency
 * @member {String} currency
 */
Order.prototype['currency'] = undefined;

/**
 * Order Open Price
 * @member {Number} openPrice
 */
Order.prototype['openPrice'] = undefined;

/**
 * Order Close Price
 * @member {Number} closePrice
 */
Order.prototype['closePrice'] = undefined;

/**
 * Order Ref Value
 * @member {Number} refValue
 */
Order.prototype['refValue'] = undefined;

/**
 * Order VWAP FfClose
 * @member {Number} vwapFfClose
 */
Order.prototype['vwapFfClose'] = undefined;

/**
 * Order VWAP OpenClose
 * @member {Number} vwapOpenClose
 */
Order.prototype['vwapOpenClose'] = undefined;

/**
 * Order firstFillMid
 * @member {Number} firstFillMid
 */
Order.prototype['firstFillMid'] = undefined;

/**
 * Order firstFillMidPerfBps
 * @member {Number} firstFillMidPerfBps
 */
Order.prototype['firstFillMidPerfBps'] = undefined;

/**
 * Order openPerfBps
 * @member {Number} openPerfBps
 */
Order.prototype['openPerfBps'] = undefined;

/**
 * Order lastFillMid
 * @member {Number} lastFillMid
 */
Order.prototype['lastFillMid'] = undefined;

/**
 * Order lastFillMidPerfBps
 * @member {Number} lastFillMidPerfBps
 */
Order.prototype['lastFillMidPerfBps'] = undefined;

/**
 * Order reversion5MinMidPrice
 * @member {Number} reversion5MinMidPrice
 */
Order.prototype['reversion5MinMidPrice'] = undefined;

/**
 * Order reversion5MinMidBps
 * @member {Number} reversion5MinMidBps
 */
Order.prototype['reversion5MinMidBps'] = undefined;

/**
 * Order reversion10MinMidPrice
 * @member {Number} reversion10MinMidPrice
 */
Order.prototype['reversion10MinMidPrice'] = undefined;

/**
 * Order reversion10MinMidBps
 * @member {Number} reversion10MinMidBps
 */
Order.prototype['reversion10MinMidBps'] = undefined;

/**
 * Order reversion15MinMidPrice
 * @member {Number} reversion15MinMidPrice
 */
Order.prototype['reversion15MinMidPrice'] = undefined;

/**
 * Order reversion15MinMidBps
 * @member {Number} reversion15MinMidBps
 */
Order.prototype['reversion15MinMidBps'] = undefined;

/**
 * Order reversion60MinMidPrice
 * @member {Number} reversion60MinMidPrice
 */
Order.prototype['reversion60MinMidPrice'] = undefined;

/**
 * Order reversion60MinMidBps
 * @member {Number} reversion60MinMidBps
 */
Order.prototype['reversion60MinMidBps'] = undefined;

/**
 * Order intraOrderVolatility
 * @member {Number} intraOrderVolatility
 */
Order.prototype['intraOrderVolatility'] = undefined;

/**
 * Order vwapFfLf
 * @member {Number} vwapFfLf
 */
Order.prototype['vwapFfLf'] = undefined;

/**
 * Order vwapFfLfPerfBps
 * @member {Number} vwapFfLfPerfBps
 */
Order.prototype['vwapFfLfPerfBps'] = undefined;

/**
 * Order closePerfBps
 * @member {Number} closePerfBps
 */
Order.prototype['closePerfBps'] = undefined;

/**
 * Order Duration Bin Min
 * @member {Number} durationBinMin
 */
Order.prototype['durationBinMin'] = undefined;

/**
 * Order Duration Bin Sec
 * @member {Number} durationBinSec
 */
Order.prototype['durationBinSec'] = undefined;

/**
 * Order Participation Rate Percentage
 * @member {Number} participationRatePct
 */
Order.prototype['participationRatePct'] = undefined;

/**
 * Order spreadCross
 * @member {Number} spreadCross
 */
Order.prototype['spreadCross'] = undefined;

/**
 * Order duration
 * @member {Number} duration
 */
Order.prototype['duration'] = undefined;

/**
 * Order pwp20Price
 * @member {Number} pwp20Price
 */
Order.prototype['pwp20Price'] = undefined;

/**
 * Order pwp20Volume
 * @member {Number} pwp20Volume
 */
Order.prototype['pwp20Volume'] = undefined;

/**
 * Order pwp20PerfBps
 * @member {Number} pwp20PerfBps
 */
Order.prototype['pwp20PerfBps'] = undefined;

/**
 * Order pwp10Price
 * @member {Number} pwp10Price
 */
Order.prototype['pwp10Price'] = undefined;

/**
 * Order pwp10Volume
 * @member {Number} pwp10Volume
 */
Order.prototype['pwp10Volume'] = undefined;

/**
 * Order pwp10PerfBps
 * @member {Number} pwp10PerfBps
 */
Order.prototype['pwp10PerfBps'] = undefined;

/**
 * Order pwp05Price
 * @member {Number} pwp05Price
 */
Order.prototype['pwp05Price'] = undefined;

/**
 * Order pwp05Volume
 * @member {Number} pwp05Volume
 */
Order.prototype['pwp05Volume'] = undefined;

/**
 * Order pwp05PerfBps
 * @member {Number} pwp05PerfBps
 */
Order.prototype['pwp05PerfBps'] = undefined;

/**
 * Order pwp01Price
 * @member {Number} pwp01Price
 */
Order.prototype['pwp01Price'] = undefined;

/**
 * Order pwp01Volume
 * @member {Number} pwp01Volume
 */
Order.prototype['pwp01Volume'] = undefined;

/**
 * Order pwp01PerfBps
 * @member {Number} pwp01PerfBps
 */
Order.prototype['pwp01PerfBps'] = undefined;

/**
 * Order pwp02Price
 * @member {Number} pwp02Price
 */
Order.prototype['pwp02Price'] = undefined;

/**
 * Order pwp02Volume
 * @member {Number} pwp02Volume
 */
Order.prototype['pwp02Volume'] = undefined;

/**
 * Order pwp02PerfBps
 * @member {Number} pwp02PerfBps
 */
Order.prototype['pwp02PerfBps'] = undefined;

/**
 * Order pwp03Price
 * @member {Number} pwp03Price
 */
Order.prototype['pwp03Price'] = undefined;

/**
 * Order pwp03Volume
 * @member {Number} pwp03Volume
 */
Order.prototype['pwp03Volume'] = undefined;

/**
 * Order pwp03PerfBps
 * @member {Number} pwp03PerfBps
 */
Order.prototype['pwp03PerfBps'] = undefined;

/**
 * Order pwp50Price
 * @member {Number} pwp50Price
 */
Order.prototype['pwp50Price'] = undefined;

/**
 * Order pwp50Volume
 * @member {Number} pwp50Volume
 */
Order.prototype['pwp50Volume'] = undefined;

/**
 * Order pwp50PerfBps
 * @member {Number} pwp50PerfBps
 */
Order.prototype['pwp50PerfBps'] = undefined;

/**
 * Order pwp100Price
 * @member {Number} pwp100Price
 */
Order.prototype['pwp100Price'] = undefined;

/**
 * Order pwp100Volume
 * @member {Number} pwp100Volume
 */
Order.prototype['pwp100Volume'] = undefined;

/**
 * Order pwp100PerfBps
 * @member {Number} pwp100PerfBps
 */
Order.prototype['pwp100PerfBps'] = undefined;

/**
 * Market Adjustment
 * @member {Number} marketAdjustment
 */
Order.prototype['marketAdjustment'] = undefined;

/**
 * intraOrderVolatilityBps
 * @member {Number} intraOrderVolatilityBps
 */
Order.prototype['intraOrderVolatilityBps'] = undefined;

/**
 * Order Reference Currency
 * @member {String} refCurrency
 */
Order.prototype['refCurrency'] = undefined;

/**
 * vwapFfLfVolume
 * @member {Number} vwapFfLfVolume
 */
Order.prototype['vwapFfLfVolume'] = undefined;

/**
 * limitVwapFfLfVolume
 * @member {Number} limitVwapFfLfVolume
 */
Order.prototype['limitVwapFfLfVolume'] = undefined;

/**
 * limitVwapFfLf
 * @member {Number} limitVwapFfLf
 */
Order.prototype['limitVwapFfLf'] = undefined;

/**
 * limitVwapFfLfPerfBps
 * @member {Number} limitVwapFfLfPerfBps
 */
Order.prototype['limitVwapFfLfPerfBps'] = undefined;

/**
 * limitParticipationRatePct
 * @member {Number} limitParticipationRatePct
 */
Order.prototype['limitParticipationRatePct'] = undefined;

/**
 * marketSpreadCross
 * @member {Number} marketSpreadCross
 */
Order.prototype['marketSpreadCross'] = undefined;

/**
 * limitPwp20Price
 * @member {Number} limitPwp20Price
 */
Order.prototype['limitPwp20Price'] = undefined;

/**
 * limitPwp20Volume
 * @member {Number} limitPwp20Volume
 */
Order.prototype['limitPwp20Volume'] = undefined;

/**
 * limitPwp20PerfBps
 * @member {Number} limitPwp20PerfBps
 */
Order.prototype['limitPwp20PerfBps'] = undefined;

/**
 * limitPwp10Price
 * @member {Number} limitPwp10Price
 */
Order.prototype['limitPwp10Price'] = undefined;

/**
 * limitPwp10Volume
 * @member {Number} limitPwp10Volume
 */
Order.prototype['limitPwp10Volume'] = undefined;

/**
 * limitPwp10PerfBps
 * @member {Number} limitPwp10PerfBps
 */
Order.prototype['limitPwp10PerfBps'] = undefined;

/**
 * limitPwp05Price
 * @member {Number} limitPwp05Price
 */
Order.prototype['limitPwp05Price'] = undefined;

/**
 * limitPwp05Volume
 * @member {Number} limitPwp05Volume
 */
Order.prototype['limitPwp05Volume'] = undefined;

/**
 * limitPwp05PerfBps
 * @member {Number} limitPwp05PerfBps
 */
Order.prototype['limitPwp05PerfBps'] = undefined;

/**
 * limitPwp01Price
 * @member {Number} limitPwp01Price
 */
Order.prototype['limitPwp01Price'] = undefined;

/**
 * limitPwp01Volume
 * @member {Number} limitPwp01Volume
 */
Order.prototype['limitPwp01Volume'] = undefined;

/**
 * limitPwp01PerfBps
 * @member {Number} limitPwp01PerfBps
 */
Order.prototype['limitPwp01PerfBps'] = undefined;

/**
 * limitPwp02Price
 * @member {Number} limitPwp02Price
 */
Order.prototype['limitPwp02Price'] = undefined;

/**
 * limitPwp02Volume
 * @member {Number} limitPwp02Volume
 */
Order.prototype['limitPwp02Volume'] = undefined;

/**
 * limitPwp02PerfBps
 * @member {Number} limitPwp02PerfBps
 */
Order.prototype['limitPwp02PerfBps'] = undefined;

/**
 * limitPwp03Price
 * @member {Number} limitPwp03Price
 */
Order.prototype['limitPwp03Price'] = undefined;

/**
 * limitPwp03Volume
 * @member {Number} limitPwp03Volume
 */
Order.prototype['limitPwp03Volume'] = undefined;

/**
 * limitPwp03PerfBps
 * @member {Number} limitPwp03PerfBps
 */
Order.prototype['limitPwp03PerfBps'] = undefined;

/**
 * limitPwp50Price
 * @member {Number} limitPwp50Price
 */
Order.prototype['limitPwp50Price'] = undefined;

/**
 * limitPwp50Volume
 * @member {Number} limitPwp50Volume
 */
Order.prototype['limitPwp50Volume'] = undefined;

/**
 * limitPwp50PerfBps
 * @member {Number} limitPwp50PerfBps
 */
Order.prototype['limitPwp50PerfBps'] = undefined;

/**
 * limitPwp100Price
 * @member {Number} limitPwp100Price
 */
Order.prototype['limitPwp100Price'] = undefined;

/**
 * limitPwp100Volume
 * @member {Number} limitPwp100Volume
 */
Order.prototype['limitPwp100Volume'] = undefined;

/**
 * limitPwp100PerfBps
 * @member {Number} limitPwp100PerfBps
 */
Order.prototype['limitPwp100PerfBps'] = undefined;

/**
 * Order FX Rate
 * @member {Number} fxRate
 */
Order.prototype['fxRate'] = undefined;

/**
 * Order twas
 * @member {Number} twas
 */
Order.prototype['twas'] = undefined;

/**
 * Order twasAskSize
 * @member {Number} twasAskSize
 */
Order.prototype['twasAskSize'] = undefined;

/**
 * Order twasBidSize
 * @member {Number} twasBidSize
 */
Order.prototype['twasBidSize'] = undefined;

/**
 * The timezone abbreviation as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
 * @member {String} timeZoneName
 */
Order.prototype['timeZoneName'] = undefined;

/**
 * The timezone identifier as defined in the list of tz database timezones  https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
 * @member {String} timeZone
 */
Order.prototype['timeZone'] = undefined;

/**
 * The two character ISO country code of the trading region. EMEA is used for the European trading region
 * @member {String} region
 */
Order.prototype['region'] = undefined;

/**
 * The two character ISO country code
 * @member {String} country
 */
Order.prototype['country'] = undefined;

/**
 * Order Date
 * @member {String} dateId
 */
Order.prototype['dateId'] = undefined;

/**
 * Order Parent Creation Time
 * @member {String} parentCreationTimeUtc
 */
Order.prototype['parentCreationTimeUtc'] = undefined;

/**
 * Order Entry Time UTC
 * @member {String} orderEntryTimeUtc
 */
Order.prototype['orderEntryTimeUtc'] = undefined;

/**
 * Order First Fill Time
 * @member {String} firstFillTime
 */
Order.prototype['firstFillTime'] = undefined;

/**
 * Order First Fill Time UTC
 * @member {String} firstFillTimeUtc
 */
Order.prototype['firstFillTimeUtc'] = undefined;

/**
 * Order Last Fill Time
 * @member {String} lastFillTime
 */
Order.prototype['lastFillTime'] = undefined;

/**
 * Order Last Fill Time UTC
 * @member {String} lastFillTimeUtc
 */
Order.prototype['lastFillTimeUtc'] = undefined;

/**
 * Order Fill Time UTC
 * @member {String} fillTimeUtc
 */
Order.prototype['fillTimeUtc'] = undefined;

/**
 * Order Strategy
 * @member {String} strategy
 */
Order.prototype['strategy'] = undefined;

/**
 * Order Venue
 * @member {String} venue
 */
Order.prototype['venue'] = undefined;

/**
 * Order Broker
 * @member {String} broker
 */
Order.prototype['broker'] = undefined;

/**
 * Order Algo
 * @member {String} algo
 */
Order.prototype['algo'] = undefined;

/**
 * Order Trader
 * @member {String} trader
 */
Order.prototype['trader'] = undefined;

/**
 * Order Note
 * @member {String} note
 */
Order.prototype['note'] = undefined;

/**
 * Order Status
 * @member {String} status
 */
Order.prototype['status'] = undefined;

/**
 * Order Error Codes
 * @member {String} errorCodes
 */
Order.prototype['errorCodes'] = undefined;

/**
 * Order Processed Time
 * @member {String} processedTime
 */
Order.prototype['processedTime'] = undefined;

/**
 * Order Client Id
 * @member {String} clientId
 */
Order.prototype['clientId'] = undefined;

/**
 * Order Destination
 * @member {String} destination
 */
Order.prototype['destination'] = undefined;

/**
 * Order Destination Type
 * @member {String} destinationType
 */
Order.prototype['destinationType'] = undefined;

/**
 * Order Type
 * @member {String} orderType
 */
Order.prototype['orderType'] = undefined;

/**
 * Order type
 * @member {module:model/Order.MessageTypeEnum} messageType
 */
Order.prototype['messageType'] = undefined;

/**
 * Related Order Ids
 * @member {Array.<String>} relatedOrderId
 */
Order.prototype['relatedOrderId'] = undefined;

/**
 * Child Orders
 * @member {Array.<module:model/Order>} children
 */
Order.prototype['children'] = undefined;

/**
 * @member {module:model/MultiDayBenchmarks} multiDayBenchmarks
 */
Order.prototype['multiDayBenchmarks'] = undefined;





/**
 * Allowed values for the <code>messageType</code> property.
 * @enum {String}
 * @readonly
 */
Order['MessageTypeEnum'] = {

    /**
     * value: "undefined"
     * @const
     */
    "undefined": "undefined",

    /**
     * value: "parent"
     * @const
     */
    "parent": "parent",

    /**
     * value: "child"
     * @const
     */
    "child": "child"
};



export default Order;

