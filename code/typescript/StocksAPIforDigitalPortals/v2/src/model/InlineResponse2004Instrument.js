/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse2003InstrumentFsym from './InlineResponse2003InstrumentFsym';
import InlineResponse2004InstrumentCompany from './InlineResponse2004InstrumentCompany';
import InlineResponse2004InstrumentIndustryClassification from './InlineResponse2004InstrumentIndustryClassification';
import InlineResponse2004InstrumentNsin from './InlineResponse2004InstrumentNsin';

/**
 * The InlineResponse2004Instrument model module.
 * @module model/InlineResponse2004Instrument
 */
class InlineResponse2004Instrument {
    /**
     * Constructs a new <code>InlineResponse2004Instrument</code>.
     * Instrument data of the notation.
     * @alias module:model/InlineResponse2004Instrument
     */
    constructor() { 
        
        InlineResponse2004Instrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Instrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Instrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Instrument} The populated <code>InlineResponse2004Instrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Instrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shortName')) {
                obj['shortName'] = ApiClient.convertToType(data['shortName'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse2004InstrumentNsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse2003InstrumentFsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('stockType')) {
                obj['stockType'] = ApiClient.convertToType(data['stockType'], 'String');
            }
            if (data.hasOwnProperty('industryClassification')) {
                obj['industryClassification'] = InlineResponse2004InstrumentIndustryClassification.constructFromObject(data['industryClassification']);
            }
            if (data.hasOwnProperty('company')) {
                obj['company'] = InlineResponse2004InstrumentCompany.constructFromObject(data['company']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse2004Instrument.prototype['id'] = undefined;

/**
 * Name of the instrument.
 * @member {String} name
 */
InlineResponse2004Instrument.prototype['name'] = undefined;

/**
 * Short name of the instrument.
 * @member {String} shortName
 */
InlineResponse2004Instrument.prototype['shortName'] = undefined;

/**
 * The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
 * @member {String} isin
 */
InlineResponse2004Instrument.prototype['isin'] = undefined;

/**
 * @member {module:model/InlineResponse2004InstrumentNsin} nsin
 */
InlineResponse2004Instrument.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse2003InstrumentFsym} fsym
 */
InlineResponse2004Instrument.prototype['fsym'] = undefined;

/**
 * Type of stock.
 * @member {module:model/InlineResponse2004Instrument.StockTypeEnum} stockType
 */
InlineResponse2004Instrument.prototype['stockType'] = undefined;

/**
 * @member {module:model/InlineResponse2004InstrumentIndustryClassification} industryClassification
 */
InlineResponse2004Instrument.prototype['industryClassification'] = undefined;

/**
 * @member {module:model/InlineResponse2004InstrumentCompany} company
 */
InlineResponse2004Instrument.prototype['company'] = undefined;





/**
 * Allowed values for the <code>stockType</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2004Instrument['StockTypeEnum'] = {

    /**
     * value: "common"
     * @const
     */
    "common": "common",

    /**
     * value: "preferred"
     * @const
     */
    "preferred": "preferred",

    /**
     * value: "depositoryReceipt"
     * @const
     */
    "depositoryReceipt": "depositoryReceipt",

    /**
     * value: "other"
     * @const
     */
    "other": "other"
};



export default InlineResponse2004Instrument;

