// ===========================================================================
// This file has been generated by
// Rats! Parser Generator, version 2.4.0,
// (C) 2004-2014 Robert Grimm,
// on Quarta-feira, 15 de Março de 2017 at 19:52:04.
// Edit at your own risk.
// ===========================================================================

import java.io.Reader;
import java.io.IOException;

import xtc.util.Pair;

import xtc.parser.ParserBase;
import xtc.parser.Column;
import xtc.parser.Result;
import xtc.parser.SemanticValue;
import xtc.parser.ParseError;

/**
 * Packrat parser for grammar <code>operators</code>.
 *
 * <p />This class has been generated by the <i>Rats!</i> parser
 * generator, version 2.4.0, (C) 2004-2014 Robert Grimm.
 */
public final class operators extends ParserBase {

  // =========================================================================

  /** Memoization table column. */
  static final class operatorsColumn extends Column {
  }

  // =========================================================================

  /**
   * Create a new packrat parser.
   *
   * @param reader The reader.
   * @param file The file name.
   */
  public operators(final Reader reader, final String file) {
    super(reader, file);
  }

  /**
   * Create a new packrat parser.
   *
   * @param reader The file reader.
   * @param file The file name.
   * @param size The file size.
   */
  public operators(final Reader reader, final String file, final int size) {
    super(reader, file, size);
  }

  // =========================================================================

  protected Column newColumn() {
    return new operatorsColumn();
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_AND.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_AND(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('&' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('&' == yyC) {
        yyIndex = yyIndex + 1;

        yyValue = null;

        return new SemanticValue(yyValue, yyIndex, yyError);
      }
    }

    // Done.
    yyError = yyError.select("o p_ a n d expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_OR.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_OR(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('|' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('|' == yyC) {
        yyIndex = yyIndex + 1;

        yyValue = null;

        return new SemanticValue(yyValue, yyIndex, yyError);
      }
    }

    // Done.
    yyError = yyError.select("o p_ o r expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_NOT.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_NOT(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('!' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ n o t expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_EQ.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_EQ(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('=' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('=' == yyC) {
        yyIndex = yyIndex + 1;

        yyValue = null;

        return new SemanticValue(yyValue, yyIndex, yyError);
      }
    }

    // Done.
    yyError = yyError.select("o p_ e q expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_LT.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_LT(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('<' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ l t expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_GT.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_GT(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('>' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ g t expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_LE.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_LE(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('<' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('=' == yyC) {
        yyIndex = yyIndex + 1;

        yyValue = null;

        return new SemanticValue(yyValue, yyIndex, yyError);
      }
    }

    // Done.
    yyError = yyError.select("o p_ l e expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_GE.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_GE(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('>' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('=' == yyC) {
        yyIndex = yyIndex + 1;

        yyValue = null;

        return new SemanticValue(yyValue, yyIndex, yyError);
      }
    }

    // Done.
    yyError = yyError.select("o p_ g e expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_NE.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_NE(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('!' == yyC) {
      yyIndex = yyStart + 1;

      yyC = character(yyIndex);
      if ('=' == yyC) {
        yyIndex = yyIndex + 1;

        yyValue = null;

        return new SemanticValue(yyValue, yyIndex, yyError);
      }
    }

    // Done.
    yyError = yyError.select("o p_ n e expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_ADD.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_ADD(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('+' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ a d d expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_SUB.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_SUB(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('-' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ s u b expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_MUL.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_MUL(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('*' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ m u l expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_DIV.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_DIV(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('/' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ d i v expected", yyStart);
    return yyError;
  }

  // =========================================================================

  /**
   * Parse nonterminal operators.OP_MOD.
   *
   * @param yyStart The index.
   * @return The result.
   * @throws IOException Signals an I/O error.
   */
  public Result pOP_MOD(final int yyStart) throws IOException {
    int        yyC;
    int        yyIndex;
    Void       yyValue;
    ParseError yyError = ParseError.DUMMY;

    // Alternative 1.

    yyC = character(yyStart);
    if ('%' == yyC) {
      yyIndex = yyStart + 1;

      yyValue = null;

      return new SemanticValue(yyValue, yyIndex, yyError);
    }

    // Done.
    yyError = yyError.select("o p_ m o d expected", yyStart);
    return yyError;
  }

}
