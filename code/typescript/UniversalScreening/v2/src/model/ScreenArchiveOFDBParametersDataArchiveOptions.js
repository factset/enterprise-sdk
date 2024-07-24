/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ScreenArchiveOFDBParametersDataArchiveOptions model module.
 * @module model/ScreenArchiveOFDBParametersDataArchiveOptions
 */
class ScreenArchiveOFDBParametersDataArchiveOptions {
    /**
     * Constructs a new <code>ScreenArchiveOFDBParametersDataArchiveOptions</code>.
     * Archive-specific parameters
     * @alias module:model/ScreenArchiveOFDBParametersDataArchiveOptions
     * @param archiveType {module:model/ScreenArchiveOFDBParametersDataArchiveOptions.ArchiveTypeEnum} Type of archive.\\ `ofdbSymbols`: Archives the list of identifiers that passed the screen to an OFDB file.\\ `ofdb`: Archives the results of the screen to a time series OFDB. A mapping between Universal Screening and the OFDB must be created and saved in the screen.\\ `ofdbNts`: Archives the results of the screen to a non-time series OFDB. A mapping between Universal Screening and the OFDB database must be created and saved in the screen.\\ `ofdbQuickNts`: Archives the results of the screen to a non-time series OFDB without requiring a Universal Screening-to-OFDB map. By default, all columns in the screen will be archived to the OFDB. Each column's parameter reference name will be used as the OFDB field name. Use the `quickColumns` property to specify which parameters to archive.
     * @param filename {String} OFDB Filename to archive to
     */
    constructor(archiveType, filename) { 
        
        ScreenArchiveOFDBParametersDataArchiveOptions.initialize(this, archiveType, filename);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, archiveType, filename) { 
        obj['archiveType'] = archiveType;
        obj['filename'] = filename;
    }

    /**
     * Constructs a <code>ScreenArchiveOFDBParametersDataArchiveOptions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScreenArchiveOFDBParametersDataArchiveOptions} obj Optional instance to populate.
     * @return {module:model/ScreenArchiveOFDBParametersDataArchiveOptions} The populated <code>ScreenArchiveOFDBParametersDataArchiveOptions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScreenArchiveOFDBParametersDataArchiveOptions();

            if (data.hasOwnProperty('archiveDate')) {
                obj['archiveDate'] = ApiClient.convertToType(data['archiveDate'], 'String');
            }
            if (data.hasOwnProperty('archiveType')) {
                obj['archiveType'] = ApiClient.convertToType(data['archiveType'], 'String');
            }
            if (data.hasOwnProperty('autoSymbolUpdates')) {
                obj['autoSymbolUpdates'] = ApiClient.convertToType(data['autoSymbolUpdates'], 'Boolean');
            }
            if (data.hasOwnProperty('existed')) {
                obj['existed'] = ApiClient.convertToType(data['existed'], 'Boolean');
            }
            if (data.hasOwnProperty('filename')) {
                obj['filename'] = ApiClient.convertToType(data['filename'], 'String');
            }
            if (data.hasOwnProperty('overwriteData')) {
                obj['overwriteData'] = ApiClient.convertToType(data['overwriteData'], 'Boolean');
            }
            if (data.hasOwnProperty('quickColumns')) {
                obj['quickColumns'] = ApiClient.convertToType(data['quickColumns'], 'String');
            }
            if (data.hasOwnProperty('symbolType')) {
                obj['symbolType'] = ApiClient.convertToType(data['symbolType'], 'String');
            }
            if (data.hasOwnProperty('timeSeries')) {
                obj['timeSeries'] = ApiClient.convertToType(data['timeSeries'], 'Boolean');
            }
            if (data.hasOwnProperty('unsplitHistory')) {
                obj['unsplitHistory'] = ApiClient.convertToType(data['unsplitHistory'], 'Boolean');
            }
            if (data.hasOwnProperty('useReportOrder')) {
                obj['useReportOrder'] = ApiClient.convertToType(data['useReportOrder'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * YYYYMMDD date to archive to
 * @member {String} archiveDate
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['archiveDate'] = undefined;

/**
 * Type of archive.\\ `ofdbSymbols`: Archives the list of identifiers that passed the screen to an OFDB file.\\ `ofdb`: Archives the results of the screen to a time series OFDB. A mapping between Universal Screening and the OFDB must be created and saved in the screen.\\ `ofdbNts`: Archives the results of the screen to a non-time series OFDB. A mapping between Universal Screening and the OFDB database must be created and saved in the screen.\\ `ofdbQuickNts`: Archives the results of the screen to a non-time series OFDB without requiring a Universal Screening-to-OFDB map. By default, all columns in the screen will be archived to the OFDB. Each column's parameter reference name will be used as the OFDB field name. Use the `quickColumns` property to specify which parameters to archive.
 * @member {module:model/ScreenArchiveOFDBParametersDataArchiveOptions.ArchiveTypeEnum} archiveType
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['archiveType'] = undefined;

/**
 * Flag to enable automatic symbol updates
 * @member {Boolean} autoSymbolUpdates
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['autoSymbolUpdates'] = undefined;

/**
 * Indicates that the output file exists
 * @member {Boolean} existed
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['existed'] = undefined;

/**
 * OFDB Filename to archive to
 * @member {String} filename
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['filename'] = undefined;

/**
 * If true and target file (or date for a time series file) exists, it will be cleared before archiving
 * @member {Boolean} overwriteData
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['overwriteData'] = undefined;

/**
 * Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted
 * @member {String} quickColumns
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['quickColumns'] = undefined;

/**
 * The type of symbol to be saved to the SYMBOL field of the OFDB\\ `cusip`: Recommended. Primarily CUSIP for North American listed securities and SEDOL for the rest of the world.\\ `ticker`: Should only be used when writing to an existing OFDB that uses Tickers in the symbol column. Primarily Tickers for North American listed securities, QUICK Codes for Japanese listed securities, and SEDOL for the rest of the world. Applicable for equity screen archives.\\ `isin`: International Securities Identification Number (ISIN). Applicable for debt screen archives.
 * @member {module:model/ScreenArchiveOFDBParametersDataArchiveOptions.SymbolTypeEnum} symbolType
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['symbolType'] = undefined;

/**
 * Has no effect. Use the `archiveType` property.
 * @member {Boolean} timeSeries
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['timeSeries'] = undefined;

/**
 * Flag indicating split adjust
 * @member {Boolean} unsplitHistory
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['unsplitHistory'] = undefined;

/**
 * If true, archive in report order
 * @member {Boolean} useReportOrder
 */
ScreenArchiveOFDBParametersDataArchiveOptions.prototype['useReportOrder'] = undefined;





/**
 * Allowed values for the <code>archiveType</code> property.
 * @enum {String}
 * @readonly
 */
ScreenArchiveOFDBParametersDataArchiveOptions['ArchiveTypeEnum'] = {

    /**
     * value: "ofdbSymbols"
     * @const
     */
    "ofdbSymbols": "ofdbSymbols",

    /**
     * value: "ofdb"
     * @const
     */
    "ofdb": "ofdb",

    /**
     * value: "ofdbNts"
     * @const
     */
    "ofdbNts": "ofdbNts",

    /**
     * value: "ofdbQuickNts"
     * @const
     */
    "ofdbQuickNts": "ofdbQuickNts"
};


/**
 * Allowed values for the <code>symbolType</code> property.
 * @enum {String}
 * @readonly
 */
ScreenArchiveOFDBParametersDataArchiveOptions['SymbolTypeEnum'] = {

    /**
     * value: "cusip"
     * @const
     */
    "cusip": "cusip",

    /**
     * value: "ticker"
     * @const
     */
    "ticker": "ticker",

    /**
     * value: "isin"
     * @const
     */
    "isin": "isin"
};



export default ScreenArchiveOFDBParametersDataArchiveOptions;

