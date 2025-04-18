/**
 * Real-Time Time Series API
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PostPricesTimeSeriesIntradayListRequestDataRange from './PostPricesTimeSeriesIntradayListRequestDataRange';
import PostVendorChartIQTimeSeriesEodListRequestDataIdentifier from './PostVendorChartIQTimeSeriesEodListRequestDataIdentifier';
import PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments from './PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments';

/**
 * The PostPricesTimeSeriesIntradayListRequestData model module.
 * @module model/PostPricesTimeSeriesIntradayListRequestData
 */
class PostPricesTimeSeriesIntradayListRequestData {
    /**
     * Constructs a new <code>PostPricesTimeSeriesIntradayListRequestData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PostPricesTimeSeriesIntradayListRequestData
     * @param identifier {module:model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier} 
     * @param range {module:model/PostPricesTimeSeriesIntradayListRequestDataRange} 
     */
    constructor(identifier, range) { 
        
        PostPricesTimeSeriesIntradayListRequestData.initialize(this, identifier, range);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, identifier, range) { 
        obj['identifier'] = identifier;
        obj['range'] = range;
    }

    /**
     * Constructs a <code>PostPricesTimeSeriesIntradayListRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostPricesTimeSeriesIntradayListRequestData} obj Optional instance to populate.
     * @return {module:model/PostPricesTimeSeriesIntradayListRequestData} The populated <code>PostPricesTimeSeriesIntradayListRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostPricesTimeSeriesIntradayListRequestData();

            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = PostVendorChartIQTimeSeriesEodListRequestDataIdentifier.constructFromObject(data['identifier']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('range')) {
                obj['range'] = PostPricesTimeSeriesIntradayListRequestDataRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('newestFirst')) {
                obj['newestFirst'] = ApiClient.convertToType(data['newestFirst'], 'Boolean');
            }
            if (data.hasOwnProperty('applyTickCorrections')) {
                obj['applyTickCorrections'] = ApiClient.convertToType(data['applyTickCorrections'], 'String');
            }
            if (data.hasOwnProperty('includeVolumeOnlyTicks')) {
                obj['includeVolumeOnlyTicks'] = ApiClient.convertToType(data['includeVolumeOnlyTicks'], 'Boolean');
            }
            if (data.hasOwnProperty('adjustments')) {
                obj['adjustments'] = PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments.constructFromObject(data['adjustments']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostVendorChartIQTimeSeriesEodListRequestDataIdentifier} identifier
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['identifier'] = undefined;

/**
 * Type of the price as configured for the customer. | Value | Description | | --- | --- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. | | yield | Yield price. |  
 * @member {module:model/PostPricesTimeSeriesIntradayListRequestData.TypeEnum} type
 * @default 'trade'
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['type'] = 'trade';

/**
 * Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | BST | Best: choose the price quality with the least delay, as entitled for the client. |  
 * @member {module:model/PostPricesTimeSeriesIntradayListRequestData.QualityEnum} quality
 * @default 'DLY'
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['quality'] = 'DLY';

/**
 * @member {module:model/PostPricesTimeSeriesIntradayListRequestDataRange} range
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['range'] = undefined;

/**
 * Deliver the chronological last part of the requested data first.
 * @member {Boolean} newestFirst
 * @default false
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['newestFirst'] = false;

/**
 * This attribute represents the choice whether to apply insert, update, and delete corrections for individual ticks sent by the exchange or devised by FactSet Digital Solutions GmbH.   If the exchange or FactSet Digital Solutions GmbH decides to correct data, a correction instruction tick is sent shortly (usually on the same trading day) after dissemination of the corresponding original tick (if any). The correction instruction is then applied, yielding a corrected view. For \"insert\" corrections, there is no original tick, and the corrected view contains the inserted tick. For \"update\" corrections, the corrected view contains the updated original tick. For \"delete\" corrections, the original tick is removed from the corrected view. | Value | Description | | --- | --- | | none | Select original tick data without applying any corrections. | | all | Select corrected view. |  
 * @member {module:model/PostPricesTimeSeriesIntradayListRequestData.ApplyTickCorrectionsEnum} applyTickCorrections
 * @default 'none'
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['applyTickCorrections'] = 'none';

/**
 * Include ticks that contain a volume without a price.
 * @member {Boolean} includeVolumeOnlyTicks
 * @default false
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['includeVolumeOnlyTicks'] = false;

/**
 * @member {module:model/PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments} adjustments
 */
PostPricesTimeSeriesIntradayListRequestData.prototype['adjustments'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
PostPricesTimeSeriesIntradayListRequestData['TypeEnum'] = {

    /**
     * value: "trade"
     * @const
     */
    "trade": "trade",

    /**
     * value: "bid"
     * @const
     */
    "bid": "bid",

    /**
     * value: "ask"
     * @const
     */
    "ask": "ask",

    /**
     * value: "yield"
     * @const
     */
    "yield": "yield"
};


/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
PostPricesTimeSeriesIntradayListRequestData['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "BST"
     * @const
     */
    "BST": "BST"
};


/**
 * Allowed values for the <code>applyTickCorrections</code> property.
 * @enum {String}
 * @readonly
 */
PostPricesTimeSeriesIntradayListRequestData['ApplyTickCorrectionsEnum'] = {

    /**
     * value: "none"
     * @const
     */
    "none": "none",

    /**
     * value: "all"
     * @const
     */
    "all": "all"
};



export default PostPricesTimeSeriesIntradayListRequestData;

