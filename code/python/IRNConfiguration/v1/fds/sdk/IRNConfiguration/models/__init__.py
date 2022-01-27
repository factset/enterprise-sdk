# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.IRNConfiguration.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.IRNConfiguration.model.approval_level_config_dto import ApprovalLevelConfigDto
from fds.sdk.IRNConfiguration.model.approval_process_config_dto import ApprovalProcessConfigDto
from fds.sdk.IRNConfiguration.model.client_sales_representative_dto import ClientSalesRepresentativeDto
from fds.sdk.IRNConfiguration.model.commentary_config_dto import CommentaryConfigDto
from fds.sdk.IRNConfiguration.model.custom_field_config_dto import CustomFieldConfigDto
from fds.sdk.IRNConfiguration.model.extended_text_config_dto import ExtendedTextConfigDto
from fds.sdk.IRNConfiguration.model.formula_config_dto import FormulaConfigDto
from fds.sdk.IRNConfiguration.model.group_config_dto import GroupConfigDto
from fds.sdk.IRNConfiguration.model.group_fields_dto import GroupFieldsDto
from fds.sdk.IRNConfiguration.model.headline_format_config_dto import HeadlineFormatConfigDto
from fds.sdk.IRNConfiguration.model.integer_config_dto import IntegerConfigDto
from fds.sdk.IRNConfiguration.model.numeric_config_dto import NumericConfigDto
from fds.sdk.IRNConfiguration.model.options_config_dto import OptionsConfigDto
from fds.sdk.IRNConfiguration.model.problem_details import ProblemDetails
from fds.sdk.IRNConfiguration.model.rating_config_dto import RatingConfigDto
from fds.sdk.IRNConfiguration.model.recommendation_config_dto import RecommendationConfigDto
from fds.sdk.IRNConfiguration.model.recommendation_settings_dto import RecommendationSettingsDto
from fds.sdk.IRNConfiguration.model.sentiment_config_dto import SentimentConfigDto
from fds.sdk.IRNConfiguration.model.sentiment_settings_dto import SentimentSettingsDto
from fds.sdk.IRNConfiguration.model.subject_config_dto import SubjectConfigDto
from fds.sdk.IRNConfiguration.model.subject_settings_dto import SubjectSettingsDto
from fds.sdk.IRNConfiguration.model.subject_summary_dto import SubjectSummaryDto
from fds.sdk.IRNConfiguration.model.team_config_dto import TeamConfigDto
from fds.sdk.IRNConfiguration.model.team_summary_dto import TeamSummaryDto
from fds.sdk.IRNConfiguration.model.user_config_dto import UserConfigDto
