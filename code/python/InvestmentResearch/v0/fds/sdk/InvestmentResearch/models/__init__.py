# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.InvestmentResearch.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.InvestmentResearch.model.analyst_id import AnalystId
from fds.sdk.InvestmentResearch.model.asset_classes import AssetClasses
from fds.sdk.InvestmentResearch.model.asset_response import AssetResponse
from fds.sdk.InvestmentResearch.model.asset_types import AssetTypes
from fds.sdk.InvestmentResearch.model.asset_types_response import AssetTypesResponse
from fds.sdk.InvestmentResearch.model.categories import Categories
from fds.sdk.InvestmentResearch.model.categories_response import CategoriesResponse
from fds.sdk.InvestmentResearch.model.categories_response_object import CategoriesResponseObject
from fds.sdk.InvestmentResearch.model.contributor_id import ContributorId
from fds.sdk.InvestmentResearch.model.count_request import CountRequest
from fds.sdk.InvestmentResearch.model.count_request_body import CountRequestBody
from fds.sdk.InvestmentResearch.model.count_response import CountResponse
from fds.sdk.InvestmentResearch.model.count_response_object import CountResponseObject
from fds.sdk.InvestmentResearch.model.coverage_actions import CoverageActions
from fds.sdk.InvestmentResearch.model.disciplines import Disciplines
from fds.sdk.InvestmentResearch.model.document import Document
from fds.sdk.InvestmentResearch.model.error_example import ErrorExample
from fds.sdk.InvestmentResearch.model.error_response import ErrorResponse
from fds.sdk.InvestmentResearch.model.ids import Ids
from fds.sdk.InvestmentResearch.model.invalid_id_error_object import InvalidIdErrorObject
from fds.sdk.InvestmentResearch.model.investment_research_response import InvestmentResearchResponse
from fds.sdk.InvestmentResearch.model.investment_research_response_items import InvestmentResearchResponseItems
from fds.sdk.InvestmentResearch.model.investment_research_response_meta import InvestmentResearchResponseMeta
from fds.sdk.InvestmentResearch.model.investment_research_response_meta_pagination import InvestmentResearchResponseMetaPagination
from fds.sdk.InvestmentResearch.model.issuer_types import IssuerTypes
from fds.sdk.InvestmentResearch.model.periodicities import Periodicities
from fds.sdk.InvestmentResearch.model.purposes import Purposes
from fds.sdk.InvestmentResearch.model.rating_actions import RatingActions
from fds.sdk.InvestmentResearch.model.report_foci import ReportFoci
from fds.sdk.InvestmentResearch.model.research_analyst_response import ResearchAnalystResponse
from fds.sdk.InvestmentResearch.model.research_analyst_response_object import ResearchAnalystResponseObject
from fds.sdk.InvestmentResearch.model.research_approaches import ResearchApproaches
from fds.sdk.InvestmentResearch.model.research_contributor_response import ResearchContributorResponse
from fds.sdk.InvestmentResearch.model.research_contributor_response_object import ResearchContributorResponseObject
from fds.sdk.InvestmentResearch.model.search_request import SearchRequest
from fds.sdk.InvestmentResearch.model.search_request_body import SearchRequestBody
from fds.sdk.InvestmentResearch.model.search_request_meta import SearchRequestMeta
from fds.sdk.InvestmentResearch.model.search_request_meta_pagination import SearchRequestMetaPagination
from fds.sdk.InvestmentResearch.model.security_response import SecurityResponse
from fds.sdk.InvestmentResearch.model.security_types import SecurityTypes
from fds.sdk.InvestmentResearch.model.security_types_response import SecurityTypesResponse
from fds.sdk.InvestmentResearch.model.sources import Sources
from fds.sdk.InvestmentResearch.model.target_actions import TargetActions
from fds.sdk.InvestmentResearch.model.time_zone_response import TimeZoneResponse
from fds.sdk.InvestmentResearch.model.time_zones_response import TimeZonesResponse
from fds.sdk.InvestmentResearch.model.weighting_actions import WeightingActions
